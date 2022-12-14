package tw.brad.myjava;

import java.io.IOException;
import java.nio.CharBuffer;

public class Brad72 {

	public static void main(String[] args) {
		// 多重執行緒 muti-thread => muti-process
		myThread mt1 = new myThread("A");
		myThread mt2 = new myThread("B");
		
		MyRunnable mr1 = new MyRunnable("C"); 
		Thread t1 = new Thread(mr1);

		t1.run();
		System.out.println("--------------------");
		
		mt1.start();
		mt2.start();
		t1.start();

		System.out.println("main");

	}

}

class myThread extends Thread{
	String name;
	 myThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i= 0;i<10;i++) {
			System.out.println(name+":"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

class MyRunnable implements Runnable {
	String name;
	MyRunnable(String name){
		this.name = name;
	}
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}
