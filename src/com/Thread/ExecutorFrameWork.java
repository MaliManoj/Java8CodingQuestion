package com.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob extends Thread {
	String name;

	PrintJob(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name+" Job started by thread " + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(name+" Job finished by thread " + Thread.currentThread().getName());
	}

}

public class ExecutorFrameWork {

	public static void main(String[] args) {
		PrintJob[] jobs = { new PrintJob("Manoj"), new PrintJob("Kishore"), new PrintJob("Lalit"),
				new PrintJob("Pankaj") };
		ExecutorService service = Executors.newFixedThreadPool(2);
		for(PrintJob job:jobs)
		{
			service.submit(job);
		}
		service.shutdown();
	}

}
