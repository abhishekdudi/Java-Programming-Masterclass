package Section15;

import static Section15.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread{

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Another Thread woke me up.");
            return;
        }

        System.out.println(ANSI_BLUE + "5 seconds have passed and I'm awake.");
    }
}
