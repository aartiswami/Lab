// Implementing the Runnable interface
class MyRunnable implements Runnable {
    // The run() method contains the code that will be executed by the thread
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        // Creating an instance of MyRunnable
        MyRunnable myRunnable = new MyRunnable();
        
        // Creating Thread objects and passing the Runnable instance
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);

        // Starting the threads
        thread1.start();
        thread2.start();
    }
}
