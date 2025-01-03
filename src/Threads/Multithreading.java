package Threads;

public class Multithreading extends Thread{
	
	private int threadNumber;
	
	public Multithreading(int t) {
		this.threadNumber=t;
	}
	
	public void run() {
		
		
		
		for(int i=0; i<=5 ; i++) {
			System.out.println(i +" is from Thread Number : "+ threadNumber);
			
	/*		if(threadNumber ==  2)
			{
				throw new RuntimeException();
			}
			
			*/
			
			try {
				Thread.sleep(2000);       // In 1000 ms
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			
		}
	}

}
