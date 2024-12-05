// Extending the Thread class
class MyThread extends Thread {
    // Overriding the run() method to define thread behavior
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Creating thread objects
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Starting the threads
        thread1.start();
        thread2.start();
    }
}
