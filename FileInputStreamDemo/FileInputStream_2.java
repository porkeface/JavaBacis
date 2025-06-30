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
        //��Ϊ���׳�FileNotFoundException�쳣����Ҫ��try-catch��������׳��쳣throws IOException
        //FileInputStream in = new FileInputStream();
        try{
            File f=new File("D:\\Soft\\Intellij IDEA 2024\\Javaproject\\JavaBacis\\FileInputStreamDemo\\test.txt");
            FileInputStream in = new FileInputStream(f);
            //�ļ�������Ϊ��123abcDEF99G
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
int read()�����������ж�ȡһ���ֽڵ����ݡ�����ֵΪ��ȡ���ֽڣ�0-255������������ļ�ĩβ�򷵻� -1��
int read(byte[] b)��
���������ж�ȡ��� b.length ���ֽڵ����ݣ�������洢���ֽ����� b �С�
����ֵΪʵ�ʶ�ȡ���ֽ�����ʵ�����Ƿ��ص������ֶ�ȡ�ֽڸ������ֽ��������Ǳ������֣���������ļ�ĩβ�򷵻� -1��
��ͨ��ѭ����ȡ�ļ����ݣ�ÿ�ζ�ȡ���b.length���ֽڡ�
//
����ͨ��ǿתΪ�ַ�(char)b
//
int read(byte[] b, int off, int len)��
���������ж�ȡ��� len ���ֽڵ����ݣ�
������洢���ֽ����� b �У���ƫ���� off ��ʼ�洢��
����ֵΪʵ�ʶ�ȡ���ֽ�������������ļ�ĩβ�򷵻� -1��
��ͨ��ѭ����ȡ�ļ����ݣ�ÿ�ζ�ȡ���len���ֽڡ�
long skip(long n)�������������������е� n ���ֽ����ݡ�����ֵΪʵ���������ֽ�����
int available()�����ؿ��Դ��������ж�ȡ�������������ֽ����Ĺ���ֵ��
void close()���ر����������ͷ���֮����������ϵͳ��Դ��
 */