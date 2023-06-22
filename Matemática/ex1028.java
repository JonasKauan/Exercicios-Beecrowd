package exercicios;
import java.util.*;

public class ex1028 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testes = in.nextInt();
		for(int i = 0; i < testes; i++) {
			int monte1 = in.nextInt();
			int monte2 = in.nextInt();
			int maior_monte = Math.max(monte1, monte2);
			int menor_monte = Math.min(monte1, monte2);
			int resto = 0;
			do {
				resto = maior_monte % menor_monte;
				maior_monte = menor_monte;
				menor_monte = resto;
			}while(resto != 0);
			
			System.out.println(maior_monte);
		}
	}
}