package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
	
Thread[] threads;

ConcurrentLinkedQueue<Task> taskQueue;

	public ThreadPool(Thread[] threads, ConcurrentLinkedQueue<Task>taskQue) {
		
		this.threads = threads;
		for (int i = 0; i < threads.length; i++) {
		threads[i] = new Worker();	
		}
		this.taskQueue = taskQueue;
		
	}

}
