package FileInputStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_2 {

    public static void main(String[] args) throws IOException {
        byte[] buf =new byte[6];
        StringBuilder str = new StringBuilder();
        String num = "";
        //因为会抛出FileNotFoundException异常所以要用try-catch捕获或者抛出异常throws IOException
        //FileInputStream in = new FileInputStream();
        try{
            File f=new File("D:\\Soft\\Intellij IDEA 2024\\Javaproject\\JavaBacis\\FileInputStreamDemo\\test.txt");
            FileInputStream in = new FileInputStream(f);
            //文件里内容为：123abcDEF99G
            int read = in.read(buf, 0, 6);
            System.out.println(read);
            for (byte b : buf) {
                str.append((char) b);
                num +=b;
            }
            System.out.println(str);
            System.out.println(num);
            in.close();
        }catch (FileNotFoundException e){}

    }
}
/*
int read()：从输入流中读取一个字节的数据。返回值为读取的字节（0-255），如果到达文件末尾则返回 -1。
int read(byte[] b)：
从输入流中读取最多 b.length 个字节的数据，并将其存储在字节数组 b 中。
返回值为实际读取的字节数，实际上是返回的是这轮读取字节个数的字节数，就是编码数字，如果到达文件末尾则返回 -1。
它通过循环读取文件内容，每次读取最多b.length个字节。
//
可以通过强转为字符(char)b
//
int read(byte[] b, int off, int len)：
从输入流中读取最多 len 个字节的数据，
并将其存储在字节数组 b 中，从偏移量 off 开始存储。
返回值为实际读取的字节数，如果到达文件末尾则返回 -1。
它通过循环读取文件内容，每次读取最多len个字节。
long skip(long n)：跳过并丢弃输入流中的 n 个字节数据。返回值为实际跳过的字节数。
int available()：返回可以从输入流中读取（或跳过）的字节数的估计值。
void close()：关闭输入流并释放与之关联的所有系统资源。
 */