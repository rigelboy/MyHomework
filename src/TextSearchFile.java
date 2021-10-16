import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TextSearchFile {
    //检索文件方法
    public static List<File> SearchFile(File folder,String keyword){
        List<File> git = new ArrayList<File>();
        if (folder.isFile()){
            git.add(folder);
        }
        File[] subfiles =folder.listFiles(new FileFilter() {
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
        if(subfiles != null){
            for (File file : subfiles) {
                if(file.isFile()){
                    git.add(file);
                }else{
                    git.addAll(SearchFile(file,keyword));
                }

            }
        }


         return git;
    }

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String k =s.next();
        Scanner sr = new Scanner(System.in);
        String kr = sr.next();
        List<File> files = SearchFile(new File(k),kr);
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }
    }
}

