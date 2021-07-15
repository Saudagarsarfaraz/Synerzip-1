package assign;

import java.util.Scanner;

public class Sum {

	@SuppressWarnings("resource")
	public static int[] takeInput() {
	 Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;		
	}
	public static int add(int arr[]) {
		int sum1=0;
		for(int i=0;i<arr.length;i++) {
			sum1=sum1+arr[i];
		}
		return sum1;
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int arr1[] = takeInput(); 
			int sum = add(arr1);
			System.out.println(sum);
		}
	}
}