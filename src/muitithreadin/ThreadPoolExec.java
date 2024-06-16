package muitithreadin;

import java.util.concurrent.*;

public class ThreadPoolExec {

    public static void main(String[] args) {
        ThreadPoolExecutor executorService=new ThreadPoolExecutor(2, 4, 10, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(2), new CustomThreadFactory(), new CustomRejectionHandler());


        for(int i=1;i<=5;i++)
        {

            executorService.submit(()->{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task processed by: "+ Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
    }
}

class CustomThreadFactory implements  ThreadFactory{


    @Override
    public Thread newThread(Runnable r) {
        Thread th=new Thread(r);
        th.setName(String.valueOf(Thread.NORM_PRIORITY));
        th.setDaemon(false);
        return th;
    }
}

class CustomRejectionHandler implements  RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println(" Task is rejected"+r.toString());
    }
}