package exercicios;
import java.util.Scanner;

public class Ex1247 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d, vf, vg;
		double tf, tg, dg;
		
		while(in.hasNext()) {
			d = in.nextInt();
			vf = in.nextInt();
			vg = in.nextInt();
			
			dg = Math.sqrt(d * d + 144);
			
			tf = 12.0 / vf;
			tg = (double) dg / vg;
			
			if(tg <= tf) {
				System.out.println("S");
			}else {
				System.out.println("N");
			}
		}
	}
}
