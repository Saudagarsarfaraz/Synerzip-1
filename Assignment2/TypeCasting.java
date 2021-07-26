package assignment;

public class TypeCasting {
    public static void main(String[] args) {
		
    	//implicit type casting
    	byte b = 10;
    	int i = b;  //converting byte(1) to int(4)
    	System.out.println(b+" "+i);
    	
        char ch = 'A';
        int j = ch; //Converting char(2) to int(4) 
        System.out.println(ch+" "+j);
    	
        //Explicit type casting
        int m = 10;
        short s = (byte)i;
        System.out.println(m+" "+s);
        
        double d = 9.78d;
        int k = (int) d; //double(8) to int(4)
        System.out.println(d+" "+k);    	
	}
	
}
