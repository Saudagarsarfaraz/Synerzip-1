package assignment;

public class InstanceDemo {
	int i=10;
	static int j=20;
	public static void m1() {
		System.out.println("m1-A");
		System.out.println(j);
		//System.out.println(i);   //Error
		//System.out.println(this.j);  //Error
	    InstanceDemo a = new InstanceDemo();
	    System.out.println(a.i);
	}
	public void m2() {
		System.out.println("m2-A");
		InstanceDemo.m1();
	}
	
                       	
	
}
