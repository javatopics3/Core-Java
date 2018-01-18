package Multithreading;
//start a thread twice
public class TestThreadTwicee1 extends Thread {
	public void run() {
		System.out.println("running...");
	}// run method

	public static void main(String[] args) {
		TestThreadTwicee1 t1 = new TestThreadTwicee1();
		t1.start();
		t1.start();
	}

}// class
