package dsa.queue;

import java.util.Queue;

public class MyQueue {

    private int front,rear,capacity;
    private int[] arr;


    public MyQueue(int size)
    {
        front =rear=0;
        capacity=size;
        arr=new int[capacity];
    }


    void enqueue(int x)
    {
        if(capacity==rear)
        {
            System.out.println("Queue is full");
        }
        else {
            arr[rear]=x;
            rear++;
        }
    }

    void dequeue()
    {
        if(front==rear)
        {
            System.out.println("Queue is empty");
        }
        else {
            for(int i=0;i<rear -1;i++)
            {
                arr[i]=arr[i+1];
            }
        }
        if(rear<capacity)
            arr[rear]=0;


        rear--;
    }

    void queueDisplay()
    {
        if(front==rear)
            System.out.println("Queue is Empty");

        for(int i=0;i<rear;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        MyQueue queue=new MyQueue(5);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
        queue.enqueue(15);

        queue.queueDisplay();
        queue.dequeue();
        queue.queueDisplay();
    }

}
