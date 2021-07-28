package multithreading;

public class Consumer extends Thread {
      Company c;
	public Consumer(Company c) {
		this.c = c;
	}
	public void run(){
		while(true) {
			try {
				this.c.consume_item();
			} catch (Exception e1) {
   				e1.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
	}
      

}
