package dsa.stack;

import java.util.Stack;

public class MyStack {

   private int size;
   private int arr[];
   private int top;

    public MyStack(int size){
        arr=new int[size];
        this.size=size;
        top=-1;
    }

    public boolean isEmpty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
    public boolean isFull()
    {
        if(top==size-1)
            return true;
        else return false;
    }

    boolean push(int x)
    {
        if(isFull())
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            arr[++top]=x;
            System.out.println(x+"pushed into stack");
            return true;
        }
    }

    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x=arr[top--];
            return x;
        }
    }

    void print()
    {
        for(int i=top;i>-1;i--)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }

    int peak()
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            return arr[top];
        }
    }


    public static void main(String[] args) {
        MyStack stack=new MyStack(10);
        stack.push(12);
        stack.push(10);
        stack.push(11);
        stack.push(13);

        stack.print();

        System.out.println();
        stack.pop();
        stack.print();

        System.out.println();
        System.out.println(stack.peak());
    }
}
