package ThreadDemo;

public class TestRunnable_4 {
    public static void main(String[] args) {
        // 创建一个新的线程
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程开始执行");
                try {
                    // 模拟一些工作
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程执行完毕");
            }
        });

        // 启动线程
        thread.start();

        System.out.println("主线程继续执行");

        try {
            // 等待线程执行完毕
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("主线程检测到子线程已结束");
    }
}