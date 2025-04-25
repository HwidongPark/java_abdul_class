package com.hwidong.stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread {
	OutputStream os;
	
	
	public Producer(OutputStream o) {
		os = o;
		
	}
	
	
	public void run() {
		int count = 1;
		while(true) {
			try {				
				os.write(count);
				
				// to make sure that the data is sent on the other side, we better flush
				os.flush();
				System.out.println("Producer " + count);
				System.out.flush();
				try {
					Thread.sleep(1000);
				} catch(Exception e) {}
				count++;				
				
			} catch(Exception e) {}
		}
	}
		
}

class Consumer extends Thread {
	InputStream is;
	
	
	public Consumer(InputStream i) {
		is = i;
		
	}
	
	
	public void run() {
		int x;
		
		while (true) {
			try {
				x=is.read();
				System.out.println("Consumer " + x);
			} catch(Exception e) {}
		}
	}
	
}



public class PipedDemo {

	public static void main(String[] args) {
		
		try {
			PipedInputStream pis = new PipedInputStream();
			PipedOutputStream pos = new PipedOutputStream();
			
			pis.connect(pos);
			//-> pos.connect(pis); 와 똑같음
			
			Producer p = new Producer(pos);
			Consumer c = new Consumer(pis);
			
			p.start();
			c.start();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
