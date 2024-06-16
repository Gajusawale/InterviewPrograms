package muitithreadin;



public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread th1=new Thread(()->{

            System.out.println("Enter in thread1 and wait");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread1 Work is finished");
        });

        th1.start();
        th1.join();
//        th1.setDaemon(true);
         
        System.out.println(th1.getPriority());
        System.out.println("Main thread task is completed");
    }
}