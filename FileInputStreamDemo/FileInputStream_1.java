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
            System.out.println("���������Դ�ӡ����");
            FileInputStream in = new FileInputStream("test.txt");//�ļ�·������
            System.out.println("Ϊʲô��������ӡ������");
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
            System.out.println("Ϊʲô��������ӡ������");
            System.out.println("Ϊʲô��������ӡ������");
        } catch (Exception e) {
            System.out.println("������쳣����: " + e.getClass().getName()); // ��������
            System.out.println("Ϊʲô���������Դ�ӡ����");
        }

        //��Ϊ������û�д��ļ����ļ�·������
        for (byte b : buf) {
            System.out.println((char)b);
        }
        System.out.println("�������� " + c1 + "����ĸ���� " + c2);
    }
}
/*
int read()�����������ж�ȡһ���ֽڵ����ݡ�����ֵΪ��ȡ���ֽڣ�0-255������������ļ�ĩβ�򷵻� -1��
int read(byte[] b)��
���������ж�ȡ��� b.length ���ֽڵ����ݣ�������洢���ֽ����� b �С�
����ֵΪʵ�ʶ�ȡ���ֽ�������������ļ�ĩβ�򷵻� -1��
int read(byte[] b, int off, int len)��
���������ж�ȡ��� len ���ֽڵ����ݣ�
 ������洢���ֽ����� b �У���ƫ���� off ��ʼ�洢��
����ֵΪʵ�ʶ�ȡ���ֽ�������������ļ�ĩβ�򷵻� -1��
long skip(long n)�������������������е� n ���ֽ����ݡ�����ֵΪʵ���������ֽ�����
int available()�����ؿ��Դ��������ж�ȡ�������������ֽ����Ĺ���ֵ��
void close()���ر����������ͷ���֮����������ϵͳ��Դ��
 */