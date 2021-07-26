package assignment;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int row=1;
		int nsp=2*n-3;
		int nst=1;
		while(row<=n) {
			
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("*");
			}
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
			}
			int cst=1;
			if(row==n) {
				cst=2;
			}
			for(;cst<=nst;cst++) {
				System.out.print("*");
			}
			System.out.println();
			row++;
			nsp-=2;
			nst+=1;
			
			
		}

	}

}
