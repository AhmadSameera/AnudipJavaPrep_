package anudip_assignment;
/*
 * Create two thread.one thread is finding average of first 10 numbers and
 *  other thread is printing square of number store in array arr={1,20,50,15,30} 
 * and make sure both thread can execute one by one.
 */
public class ThreadOfAvgSqrt {

	public static void main(String[] args) {
		        Object lock = new Object();
		        int[] arr = { 1, 20, 50, 15, 30 };

		        // Thread for calculating average
		        Thread averageThread = new Thread(() -> {
		            synchronized (lock) {
		                int sum = 0;
		                for (int i = 1; i <= 10; i++) {
		                    sum += i;
		                }
		                double average = (double) sum / 10;
		                System.out.println("Average of first 10 numbers: " + average);

		                // Notify the lock to release and allow the other thread to execute
		                lock.notify();
		            }
		        });

		        // Thread for printing squares
		        Thread squareThread = new Thread(() -> {
		            synchronized (lock) {
		                for (int num : arr) {
		                    System.out.println("Square of " + num + " is " + num * num);
		                }

		                // Notify the lock to release and allow the other thread to execute
		                lock.notify();
		            }
		        });

		        // Start the averageThread
		        averageThread.start();

		        // Wait for averageThread to complete before starting the squareThread
		        try {
		            synchronized (lock) {
		                lock.wait();
		            }
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }

		        // Start the squareThread
		        squareThread.start();

		        // Wait for squareThread to complete before exiting
		        try {
		            synchronized (lock) {
		                lock.wait();
		            }
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		    

	}

}
