package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args)  {
         
	   //Declare ArrayList
       //ArrayList<Integer> a1 = new ArrayList<Integer>();
       //ArrayList<String> a1 = new ArrayList<>();
	   //List a1 = new ArrayList();
	   ArrayList a1 = new ArrayList();
	   
	   //Add new elements to ArrayList
	   a1.add(100);
	   a1.add("welcome");
	   a1.add("15.5");
	   a1.add('A');
	   a1.add(true);
	   
	   System.out.println(a1); //[100, welcome, 15.5, A, true]
	   
	   //size()
	   System.out.println("Number of elements in array list:"+a1.size()); //5
	   
	   //remove()
	   a1.remove(1); // 1 is index
	   // a1.remove("welcome"); //here welcome is element
	   
	   System.out.println("After removing elements from array list:"+a1);//[100, 15.5, A, true]
	   
	   //insert a new element
	   //add(index, object)
	   a1.add(2, "Java");
	   System.out.println("After Insertion"+a1); //[100, 15.5, Java, A, true]
	   
	   //retreive specific element
	   System.out.println(a1.get(2));  //Java
	   
	   //change element/replace
	   a1.set(2, "python");
	   System.out.println("After replacing new element"+a1);//[100, 15.5, python, A, true]
	   
	   //search -contains() -returns true/false
	   System.out.println(a1.contains("Java")); //false
	   System.out.println(a1.contains("python")); //true
	   
	   //isEmpty()
	   System.out.println(a1.isEmpty());//false
	   
	   //1) for loop
	   /*System.out.println("Reading elements using for loop...");
	   for(int i=0;i<a1.size();i++) {
		   System.out.println(a1.get(i));
	   }*/
	   
	   //2) for..each loop
	   /*System.out.println("Reading elements using for..each loop");
	   for(Object e:a1) {
		   System.out.println(e);
	   }*/
	   
	   //3) iterator()
	   System.out.println("Reading elements using iterator method");
	   
	   Iterator it = a1.iterator();
	   while(it.hasNext()) {
		   System.out.println(it.next());
	   } 
    }
}
