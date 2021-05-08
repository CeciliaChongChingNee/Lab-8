public class SimpleThreadDemo {

	public static void main(String[] args) {

		Thread firstThread = new SimpleThreadTask();
		Thread secondThread = new SimpleThreadTask();
		
		firstThread.start();
		secondThread.start();
		
	}

}
