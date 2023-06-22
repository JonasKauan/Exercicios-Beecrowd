package exercicios;
import java.util.Scanner;

public class Ex1197 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int v, t, s;
		
		while(in.hasNext()) {
			v = in.nextInt();
			t = in.nextInt();
			
			s = v * 2 * t;
			System.out.println(s);
		}
	}
}