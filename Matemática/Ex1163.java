package exercicios;
import java.util.Scanner;

public class Ex1163 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double h, a, v, vx,vy, t, x, delta, radianos;
		int p1, p2, n;
		
		while(in.hasNext()) {
			h = in.nextDouble();
			p1 = in.nextInt();
			p2 = in.nextInt();
			n = in.nextInt();
			for(int i = 0; i < n; i++) {
				a = in.nextDouble();
				v = in.nextDouble();
				radianos = a * 3.14159 / 180;
				
				vy = v * Math.sin(radianos);
				vx = v * Math.cos(radianos);
				
				delta = vy * vy + 19.6133 * h;
				
				t = (vy + Math.sqrt(delta)) / 9.80665;
				x = vx * t;
				
				String mensagem = "NUCK";
				
				if(x >= p1 && x <= p2) {
					mensagem = "DUCK";
				}
				
				System.out.printf("%.5f -> %s\n",x,mensagem);
			}
		}
	}
}
