package IO输入输出流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileSearch {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\auto.txt");
        File kia = new File("D:\\auto2.txt");
        System.out.println(kia.mkdirs());
        FileOutputStream fos = new FileOutputStream("D:\\auto2.txt");
        fos.flush();
        fis.close();
        fos.close();
    }
}
