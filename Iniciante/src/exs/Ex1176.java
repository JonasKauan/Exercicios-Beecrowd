package exs;
import java.util.Scanner;
public class Ex1176 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0; i < t; i++) {
			int n = in.nextInt();
			long[] fib = new long[61];
			fib[0] = 0;
			fib[1] = 1;
			if(n > 1) {
				for(int j = 2; j <= n; j++) {
					fib[j] = fib[j-1] + fib[j-2];
				}
			}
			
			System.out.printf("Fib(%d) = %d\n",n,fib[n]);
		}
	}
}
