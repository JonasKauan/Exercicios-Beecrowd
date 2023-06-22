package exercicios;
import java.util.*;

public class Ex1161 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1, n2;
		long soma;
		
		while(in.hasNext()) {
			n1 = in.nextInt();
			n2 = in.nextInt();
			soma = fatorial(n1) + fatorial(n2);
			System.out.println(soma);			
		}
	}
	
	public static long fatorial(int n) {
		if(n == 0) {
			return 1;
		}
		
		long fatorial = n;
		
		
		for(var i = n-1; i > 1; i--) {
			fatorial *= i;
		}
		
		return fatorial;
	}
}