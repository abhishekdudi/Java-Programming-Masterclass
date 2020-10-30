package Section15;

import static Section15.ThreadColor.*;

public class ThreadsMain {

    public static void main(String[] args) {
        System.out.println(ANSI_BLACK + "Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Other Thread ==");
        anotherThread.start();
//        anotherThread.start(); This gives an error as we can only start a thread once. But we can run it many times.

//        new Thread() {
//            public void run() {
//                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread.");
//            }
//        }.start();
        new Thread(() -> System.out.println(ANSI_GREEN + "Hello from the anonymous class thread.")).start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous implementation of run().");
                try {
                    anotherThread.join(2000);
                    System.out.println(ANSI_RED + "Another thread terminated or timed out, so I am running");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait. I was interrupted");
                }
            }
        });
        myRunnableThread.start();
        anotherThread.interrupt();

        System.out.println(ANSI_BLACK + "Hello again from the main thread.");

    }
}
