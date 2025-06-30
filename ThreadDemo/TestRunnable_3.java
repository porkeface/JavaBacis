package ThreadDemo;

public class TestRunnable_3 implements Runnable{
    @Override
    public void run() {
        //小明小红都执行了5次
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
    public static void main(String[] args) {
        TestRunnable_3 t = new TestRunnable_3();
        new Thread(t,"小明").start();
        new Thread(t,"小红").start();
    }
}
