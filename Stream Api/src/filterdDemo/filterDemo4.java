package filterdDemo;

import java.util.ArrayList;
import java.util.List;

public class filterDemo4 {
	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<Product>();		
		
		productList.add(new Product(1,"Hp",25000));
		productList.add(new Product(1,"Dell",30000));
		productList.add(new Product(1,"Sony",23000));
		productList.add(new Product(1,"Apple",90000));
		
		productList.stream()
		                    .filter(p->p.price>25000)  //filtering 
		                    .forEach(pr->System.out.println(pr.price)); //iterating
		
		
	}

}
