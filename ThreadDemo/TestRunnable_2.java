package ThreadDemo;

public class TestRunnable_2 implements Runnable {
    private int x = 0;
    private int y = 0;

    public static void main(String[] args) {
        TestRunnable_2 t1 = new TestRunnable_2();
        /*
        可能出现
        x=1,y =2
        x=3,y =3
        x=4,y =4
        x=5,y =5
        x=6,y =6
        x=2,y =2
        x=8,y =8
        x=9,y =9
        x=10,y =10
        x=11,y =11
        */
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        new Thread(t1,"小明").start();
        new Thread(t1,"小红").start();
    }

    public void run() {
        //*********Found**********
        int k = 0;
        //for(; ; )无限循环
        for (; ; ) {
            x++;
            //*********Found**********
            y++;
            k++;
            if (k > 5) break;
            System.out.println("x=" + x + ",y =" + y);
        }
    }
}