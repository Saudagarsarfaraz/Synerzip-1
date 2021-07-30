package multithreading;

public class Thead_example1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Thread guruthread1 = new Thread();
		guruthread1.start();
		try {
			guruthread1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		guruthread1.setPriority(1);
		int guruPriority = guruthread1.getPriority();
		System.out.println(guruPriority);
		System.out.println("Thread Running");
		}
        
}
