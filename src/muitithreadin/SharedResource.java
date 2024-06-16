package muitithreadin;

import java.util.concurrent.Semaphore;

public class SharedResource {
    private final Semaphore semaphore = new Semaphore(2); // Allow up to 2 threads at a time

    public void accessResource() {
        try {
            semaphore.acquire(); // Acquire a permit, blocking if none are available
            // Critical section
            System.out.println(Thread.currentThread().getName() + " is accessing the resource");

            Thread.sleep(10000);
            // Perform the task that requires synchronization
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release(); // Release the permit
        }
    }

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Create multiple threads trying to access the shared resource
        for (int i = 1; i <= 5; i++) {
            Thread thread = new Thread(sharedResource::accessResource, "Thread " + i);
            thread.start();
        }
    }
}
