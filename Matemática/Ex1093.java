package exercicios;
import java.util.*;

public class Ex1093 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int ev1, ev2, d, at;
		double turnosV1, turnosV2, p;
		while(true){
			ev1 = in.nextInt();
			ev2 = in.nextInt();
			at = in.nextInt();
			d = in.nextInt();
			
			if(ev1 == 0 && ev2 == 0 && d == 0 && at == 0) {
				break;
			}
			
			turnosV1 = ev1;
			ev1 = 0;
			
			while(turnosV1 > 0) {
				turnosV1 -= d;
				ev1++;
			}
			
			turnosV2 = ev2;
			ev2 = 0;
			
			while(turnosV2 > 0) {
				turnosV2 -= d;
				ev2++;
			}
			
			p = prob(ev1, ev2, at) * 100;
			System.out.printf("%.1f\n", p);
		}
	}
	
	public static double prob(double ev1, double ev2, double at) {
		double chances;
		if(at == 3) {
			return ev1 / (ev1 + ev2);
		}else {
			double p = (6.0 - at) / 6.0;
			p = p / (1.0 - p);
			return (1.0 - pot(p, ev1)) / (1.0 - pot(p, (ev1+ev2)));			
		}
	}
	
	public static double pot(double base, double expoente) {
		double potencia = base;
		for(int i = 1; i < expoente; i++) {
			potencia *= base;
		}
		
		return potencia;
	}
}