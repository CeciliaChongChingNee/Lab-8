public class SimpleRunnableDemo {

	public static void main(String[] args) {
		
		Runnable simpleRunnableTask = new SimpleRunnableTask();
		
		Thread text = new Thread(simpleRunnableTask,"text");
		Thread word1 = new Thread(simpleRunnableTask, "word1");
		Thread word2 = new Thread(simpleRunnableTask, "word2");

		
		text.start();
		word1.start();
		word2.start();
		
	}

}
