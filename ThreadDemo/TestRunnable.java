package ThreadDemo;

public class TestRunnable implements Runnable{
//��Դ����
    private int tickets=10;
    int count=0;
    @Override
    public void run() {
        while (true){
            if(tickets==0){
                break;
            }
            try {
                //ǿ�������ܴ��ڲ���������
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"�����˵�"+tickets--+"Ʊ");
            count++;
        }
        System.out.println(Thread.currentThread().getName()+count);
    }

    public static void main(String[] args) {
        TestRunnable t = new TestRunnable();
        new Thread(t,"��ţ").start();
        new Thread(t,"С��").start();
//        new Thread(t,"���˹�").start();
//        System.out.println("over!!!");

    }
}
