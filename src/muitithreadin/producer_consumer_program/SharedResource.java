package muitithreadin.producer_consumer_program;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {


    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource( int bufferSize) {
        this.sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produceItem( int item) throws InterruptedException {

        while(sharedBuffer.size()==bufferSize)
        {
            System.out.println("buffer is full, Producer is waiting for the consume");
            wait();

        }

        sharedBuffer.add(item);
        System.out.println("produced "+ item);
        notify();
    }

    public synchronized int  consumeItem() throws InterruptedException {



        while (sharedBuffer.isEmpty())
        {
            System.out.println("Buffer is empty, Consumer is waiting for producer ");

            wait();
        }
        System.out.println("Item is consumed by "+ Thread.currentThread().getName());
        int item =sharedBuffer.poll();

        System.out.println(" Consumed: "+item);
        notify();

        return item;

    }
}
