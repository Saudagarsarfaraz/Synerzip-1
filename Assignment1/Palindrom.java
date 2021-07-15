package assign;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		int i = 0;
		int j = str1.length()-1;
		int flag=1;
		while(i<=j) {
			if(str1.charAt(i) != str1.charAt(j)) {
			       	flag=0;
			       	break;
			}
			i++;
			j--;
		}
		if(flag==1) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}
