package exs;
import java.util.Scanner;
public class Ex1151 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int atual = 0, anterior = 1;
		int n = in.nextInt();
		for(int i = 1; i <= n; i++) {
			
			if(i == n) {
				System.out.println(atual);
			}else {
				System.out.print(atual+" ");
			}
			
			int aux = atual;
			atual += anterior;
			anterior = aux;
		}
	}
}
