package KeyWordsDemo;

//*********Found********
public class synchronizedDemo extends Thread {
    static RegistrationAgent agent;
    static boolean timetoquit = false;

    public static void main(String[] args) {
        agent = new RegistrationAgent();
        Thread[] t = new Thread[3];
        for (int i = 0; i < 3; i++) {
            t[i] = new synchronizedDemo();
            //*********Found********
            t[i].start();
        }
    }

    public void run() {
        //*********Found********
        while (!timetoquit) {
            boolean r = agent.reg();
            if (!r)
                timetoquit = true;
            try {
                Thread.sleep(2);
            } catch (Exception e) {
            }
        }
    }
}

class RegistrationAgent {
    private int quota = 0;

    public boolean reg() {
        //synchronized()¹Ø¼ü×Ö
        synchronized (this) {
            if (quota < 10) {
                //*********Found********
                quota++;
                System.out.print(Thread.currentThread().getName());
                System.out.println(" Registered one student, and total " + quota
                        + " students registered.");
                return true;
            } else
                //*********Found********
                return false;
        }
    }
}
