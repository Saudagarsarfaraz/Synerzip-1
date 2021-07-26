package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample1 {
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add("X");
		a1.add("Y");
		a1.add("Z");
		a1.add("A");
		a1.add("B");
		a1.add("C");
		
		ArrayList a1_dup = new ArrayList();
		a1_dup.addAll(a1);
		System.out.println(a1_dup); //[X, Y, Z, A, B, C]
		
		a1_dup.removeAll(a1);
		System.out.println("After removing:"+a1_dup);//After removing:[]
        
		//Sort()
		System.out.println("Elements Before Sorting:"+a1);
		Collections.sort(a1);
		System.out.println("Elements After Sorting:"+a1);
		
		Collections.sort(a1, Collections.reverseOrder());
		System.out.println("Elements in the ArrayList after sorting in reverse order:"+a1);
		
		
		
	}

}
