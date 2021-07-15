package assign;
import java.util.Scanner;
public class Ncr {
		public static int factorial(int num) {
			int Fact = 1;
			for (int i = 1; i <= num; i++) {
				Fact *= i;
			}
			return Fact;
		}

		public static int ncr(int n, int r) {
			int FactN = factorial(n);
			int FactR = factorial(r);
			int FactNR = factorial(n - r);
			int result = FactN / (FactR * FactNR);
			return result;
		}

		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int r = sc.nextInt();
			int res = ncr(n, r);

			System.out.println(res);
		}
	}
