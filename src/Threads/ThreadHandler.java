package Threads;

public class ThreadHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Single Thread
		
		// Multithreading t = new Multithreading();
		
		/*
		
		// Multi Threads 
		
		Multithreading t1 = new Multithreading(1);
		
		Multithreading t2 = new Multithreading(2);
		
		Multithreading t3 = new Multithreading(3);



		
		t1.start();
		t2.start();
		t3.start();
		
		*/
		
		MultiThreadingRunnable t1 = new MultiThreadingRunnable(1);
		Thread tt1 = new Thread(t1);
		
		MultiThreadingRunnable t2 = new MultiThreadingRunnable(2);
		Thread tt2 = new Thread(t2);

		
		MultiThreadingRunnable t3 = new MultiThreadingRunnable(3);
		Thread tt3 = new Thread(t3);
		
		
		
		tt1.start();
		tt2.start();
		tt3.start();



		

	}

}
