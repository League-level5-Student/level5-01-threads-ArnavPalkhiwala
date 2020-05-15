package _03_Threaded_Reverse_Greeting;

public class ThreadGreeter implements Runnable{
	
	int threadNumber;
	
	public ThreadGreeter(int threadNumber) {
		this.threadNumber = threadNumber;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from thread number: " + threadNumber);
		ThreadGreeter tg = new ThreadGreeter(threadNumber + 1);
		if (threadNumber < 50) {
			Thread r1 = new Thread(tg);
			
			r1.start();
			try {
				r1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
	}

}
