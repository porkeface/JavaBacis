package ThreadDemo;

public class TestRunnable_3 implements Runnable{
    @Override
    public void run() {
        //С��С�춼ִ����5��
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
    public static void main(String[] args) {
        TestRunnable_3 t = new TestRunnable_3();
        new Thread(t,"С��").start();
        new Thread(t,"С��").start();
    }
}
