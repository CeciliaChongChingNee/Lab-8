import java.time.LocalDateTime;

public class SimpleThreadTask extends Thread {

	// This function prints the current time and the thread name
	public void printTime() {
		for(int i = 0;i<10;i++) {
			System.out.println(LocalDateTime.now() + " - " + this.getName());
		}
	}
	
	@Override
	public void run() {
		printTime();
	}
}
