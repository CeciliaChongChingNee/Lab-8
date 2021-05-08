import java.util.Arrays;
import java.util.Random;

public class SimpleRunnableTask implements Runnable{

	// Data for display
	private String[] data = {"It", "is", "recommended", "to", "use", "Calendar", "class"};

	// This function is for display the data array in a random order
	public void displayRandomData() {
		
		// Shuffle the array in random order
		Random rand = new Random();
		for (int i = 0; i < data.length; i++) {
			int randomIndexToSwap = rand.nextInt(data.length);
			String temp = data[randomIndexToSwap];
			data[randomIndexToSwap] = data[i];
			data[i] = temp;
		}
		System.out.println(Arrays.toString(data));	
		
	}
	
	// This function is to extract portion of text in repetition. The extraction will increase with repetition
	public void extractPortion() {
		
		String text = "A method that will extract portions of text in 10 repetitions";
		for(int i  = 1; i<=10;i++) {
			System.out.println(text.substring(0, i));
		}
		
	}
	
	/**
	 * If current thread name is text, extract portion of text in repetition
	 * If current thread name is word1 or word2, display data array in random order
	 */
	@Override
	public void run() {
		
		Thread currentThread = Thread.currentThread();
		if(currentThread.getName().equals("text")) {
			extractPortion();
		}else if(currentThread.getName().equals("word1") || currentThread.getName().equals("word2")) {
			displayRandomData();
		}
	}

}
