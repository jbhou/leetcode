package test;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestDeadLock {


    static class LockThread extends Thread {


        private String s1;
        private String s2;


        public LockThread(String s1, String s2) {
            this.s1 = s1;
            this.s2 = s2;
        }


        @Override
        public void run() {

            synchronized (s1) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (s2) {
                    System.err.println("s2 lock");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


            }


        }
    }


    public static void main(String[] args) throws InterruptedException {
        ThreadMXBean mbean = ManagementFactory.getThreadMXBean();
        Runnable dlCheck = () -> {

            long[] threadIds = mbean.findDeadlockedThreads();
            if (threadIds != null) {
                ThreadInfo[] threadInfos = mbean.getThreadInfo(threadIds);
                System.out.println("Detected deadlock threads:");
                for (ThreadInfo threadInfo : threadInfos) {
                    System.out.println(threadInfo.getThreadName());
                }
            }
        };

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.scheduleAtFixedRate(dlCheck, 5L, 10L, TimeUnit.SECONDS);

        String s1 = "s1";
        String s2 = "s2";
        Thread t1 = new LockThread(s1, s2);
        Thread t2 = new LockThread(s2, s1);

        t1.setName("thread t1");
        t2.setName("thread t2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();

// 死锁样例代码…
    }


}
