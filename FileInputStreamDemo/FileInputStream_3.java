package FileInputStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStream_3 {

    public static void main(String[] args) throws IOException {
        byte[] buf =new byte[5];
        File f =new File("D:\\Soft\\Intellij IDEA 2024\\Javaproject\\JavaBacis\\FileInputStreamDemo\\test.txt");
        FileInputStream fis=new FileInputStream(f);
        //123abcDEF99G
        int red=fis.read(buf);
        while(red!=-1){
            StringBuilder str =new StringBuilder();
            StringBuilder num =new StringBuilder();
            for (byte b : buf) {
                str.append((char)b);
                num.append(b);
            }
            System.out.println(Arrays.toString(buf));
            System.out.println(red);
            System.out.println(str);
            System.out.println(num);
            System.out.println("----------------");
            red=fis.read(buf);
        }
    }
}
