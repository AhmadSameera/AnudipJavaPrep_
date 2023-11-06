package anudip_assignment;

public class OddEvenUsingThread {
	    private static final Object lock = new Object();
	    private static volatile boolean isOddTurn = true;

	    public static void main(String[] args) {
	        Thread oddThread = new Thread(() -> printOddNumbers());
	        Thread evenThread = new Thread(() -> printEvenNumbers());

	        oddThread.start();
	        evenThread.start();
	    }

	    public static void printOddNumbers() {
	        synchronized (lock) {
	            for (int i = 1; i <= 100; i += 2) {
	                while (!isOddTurn) {
	                    try {
	                        lock.wait();
	                    } catch (InterruptedException e) {
	                        Thread.currentThread().interrupt();
	                    }
	                }
	                System.out.println("Odd: " + i);
	                isOddTurn = false;
	                lock.notify();
	            }
	        }
	    }

	    public static void printEvenNumbers() {
	        synchronized (lock) {
	            for (int i = 2; i <= 100; i += 2) {
	                while (isOddTurn) {
	                    try {
	                        lock.wait();
	                    } catch (InterruptedException e) {
	                        Thread.currentThread().interrupt();
	                    }
	                }
	                System.out.println("Even: " + i);
	                isOddTurn = true;
	                lock.notify();
	            }
	        }
	    }
}
