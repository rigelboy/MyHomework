package FileTest;

import java.io.File;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        int dirNum = 0,fileNum = 0;
        File file = new File("D:\\auto.txt");
        String[] a = {"dwad","fwaf","fwaf","fgwa"};
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (Exception ex){
                System.out.println("出异常");
            }
        }
        System.out.println("文件是否存在:"+ file.exists());
        System.out.println("文件?"+file.isFile()+"\n"+"目录?"+file.isDirectory());
        System.out.println("文件名:"+file.getName()+"\n"+"绝对路径字符串"+file.getAbsolutePath()+"文件长度"+file.length());
        File directory = new File("D:\\myjava\\chapter7\\1");
        System.out.println(directory.mkdirs());
        File dir = new File("D:\\myjava");
        String str[] = dir.list();
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        File[] fs =  dir.listFiles();
        for (int i = 0; i < fs.length; i++) {
            System.out.println(fs[i]);
            System.out.println(fs[i].getName());
            System.out.println(new Date(fs[i].lastModified())+"\t");
            if (fs[i].isDirectory()){
                dirNum++;
                System.out.println("<DIR>\t");
            }else{
                fileNum++;
                System.out.println(fs[i].length()+"\t");
            }
        }
        file.delete();
    }
}
