package FileInputStreamDemo;

import java.io.FileInputStream;

public class FileInputStream_1 {
    public static void main(String[] args) {
        //*********Found**********
        byte[] buf = new byte[5];
        int len = 0, c1 = 0, c2 = 0;
        //*********Found**********
        try {
            //*********Found**********
            System.out.println("这里语句可以打印出来");
            FileInputStream in = new FileInputStream("test.txt");//文件路径不对
            System.out.println("为什么这语里句打印不出来");
            while ((len = in.read(buf, 0, 5)) > 0) {
                for (int i = 0; i < len; i++)
                    if (buf[i] >= '0' && buf[i] <= '9') {
                        c1++;
                    } else if ((buf[i] >= 'a' && buf[i] <= 'z') || buf[i] >= 'A' && buf[i] <= 'Z')
                        c2++;
                if (len < 5) break;
            }
            //*********Found**********
            in.close();
            System.out.println("为什么这里语句打印不出来");
            System.out.println("为什么这里语句打印不出来");
        } catch (Exception e) {
            System.out.println("捕获的异常类型: " + e.getClass().getName()); // 包括包名
            System.out.println("为什么这里语句可以打印出来");
        }

        //因为根本就没有打开文件，文件路径不对
        for (byte b : buf) {
            System.out.println((char)b);
        }
        System.out.println("数字数是 " + c1 + "，字母数是 " + c2);
    }
}
/*
int read()：从输入流中读取一个字节的数据。返回值为读取的字节（0-255），如果到达文件末尾则返回 -1。
int read(byte[] b)：
从输入流中读取最多 b.length 个字节的数据，并将其存储在字节数组 b 中。
返回值为实际读取的字节数，如果到达文件末尾则返回 -1。
int read(byte[] b, int off, int len)：
从输入流中读取最多 len 个字节的数据，
 并将其存储在字节数组 b 中，从偏移量 off 开始存储。
返回值为实际读取的字节数，如果到达文件末尾则返回 -1。
long skip(long n)：跳过并丢弃输入流中的 n 个字节数据。返回值为实际跳过的字节数。
int available()：返回可以从输入流中读取（或跳过）的字节数的估计值。
void close()：关闭输入流并释放与之关联的所有系统资源。
 */