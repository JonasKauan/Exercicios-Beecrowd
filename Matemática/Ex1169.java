package exercicios;
import java.util.Scanner;
import java.math.BigInteger;

public class Ex1169 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,x;
		
		n = in.nextInt();
	
		for(int i = 0; i < n; i++) {
			x = in.nextInt();
			BigInteger qtd = BigInteger.valueOf(1);
			for(var j = 1; j <= x; j++) {
				qtd = qtd.multiply(BigInteger.valueOf(2));				
			}
			
			BigInteger kg = qtd.divide(BigInteger.valueOf(12000));
			
			System.out.println(kg+" kg");
		}
	}
}