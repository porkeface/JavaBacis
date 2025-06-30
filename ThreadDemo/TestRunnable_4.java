package ThreadDemo;

public class TestRunnable_4 {
    public static void main(String[] args) {
        // ����һ���µ��߳�
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("�߳̿�ʼִ��");
                try {
                    // ģ��һЩ����
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("�߳�ִ�����");
            }
        });

        // �����߳�
        thread.start();

        System.out.println("���̼߳���ִ��");

        try {
            // �ȴ��߳�ִ�����
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("���̼߳�⵽���߳��ѽ���");
    }
}