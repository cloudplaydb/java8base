package com.ts.threads;

public class RunnableWorker implements Runnable {

	private String message;

	public RunnableWorker(String message) {
		this.message = message;
	}

	public void run() {
		while (true) {
			System.out.println(message);
		}
	}
}
