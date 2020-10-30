package Section15;

import static Section15.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from Runnable's implementation of run().");
    }
}
