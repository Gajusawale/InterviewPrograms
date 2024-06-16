package muitithreadin.producer_consumer_program;

public class Main {

    public Main()
    {

    }

    public static void main(String[] args) {

        SharedResource sharedResource=new SharedResource(6);

        Thread producerThread=new Thread(()->{

            try {

                for(int i=1;i<=6;i++)
                {
                    sharedResource.produceItem(i);
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        });

        Thread consumerThread=new Thread(()->{

            try {

                for(int i=1;i<=6;i++)
                {
                    sharedResource.consumeItem();
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        });

        producerThread.start();

        consumerThread.start();


    }
}
