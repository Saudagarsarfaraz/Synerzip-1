package assign;

import java.util.Scanner;

public class Insertion {

	public static void insertion(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp){
			      arr[j+1]=arr[j];
			      j--;
			}
			arr[j+1]=temp;	
		}
		
	}
	public static void main(String[] args)  {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
		    	arr1[i] = sc.nextInt(); 
		}
        insertion(arr1);
        for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}		
	}
}