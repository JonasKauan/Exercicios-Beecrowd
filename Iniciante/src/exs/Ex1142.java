package exs;
import java.util.Scanner;
public class Ex1142 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int incremento = 0;
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			
			for(int j = 1; j <= 3; j++) {
				System.out.print((j + incremento)+" ");
			}
			
			System.out.println("PUM");
			incremento += 4;
		}
	}
}