package ThreadDemo;

public class TestRunnable implements Runnable{
//资源抢夺
    private int tickets=10;
    int count=0;
    @Override
    public void run() {
        while (true){
            if(tickets==0){
                break;
            }
            try {
                //强得慢可能存在并发性问题
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"抢到了第"+tickets--+"票");
            count++;
        }
        System.out.println(Thread.currentThread().getName()+count);
    }

    public static void main(String[] args) {
        TestRunnable t = new TestRunnable();
        new Thread(t,"黄牛").start();
        new Thread(t,"小明").start();
//        new Thread(t,"憨八龟").start();
//        System.out.println("over!!!");

    }
}
