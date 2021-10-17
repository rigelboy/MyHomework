import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextSearchFile {
    //检索文件方法
    public static List<File> SearchFile(File folder,String keyword){
        List<File> git = new ArrayList<File>();
        if (folder.isFile()){
            git.add(folder);
        }
        //甄别关键字文件
        File[] selectfiles =folder.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                if (file.isDirectory()){
                    return true;
                }
                if(file.getName().toLowerCase().contains(keyword)){
                    return true;
                }
                return false;
            }
        });
        if(selectfiles != null){
            for (File file : selectfiles) {
                if(file.isFile()){
                    git.add(file);
                }else{
                    git.addAll(SearchFile(file,keyword));//是文件夹则用递归方法获得所有文件
                }

            }
        }
         return git;
    }

    public static void main(String[] args) throws IOException {
        Scanner s =new Scanner(System.in);
        String k =s.next();
        Scanner sr = new Scanner(System.in);
        String kr = sr.next();
        List<File> files = SearchFile(new File(k),kr);
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
            FileInputStream  vs = new FileInputStream(file);
            FileOutputStream vsc = new FileOutputStream(new File("C:\\Users\\wangjie\\Desktop\\"+file.getName()+1+".png"));
            int num = 0 ;
            num = vs.read();
            vsc.write(num);
            vsc.flush();
            vs.close();
            vsc.close();
        }
    }
}

