package exercicios;
import java.util.Scanner;

public class Ex1193 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String base, x, baseR[];
		long r[];
		int n;
		
		n = in.nextInt();
		for(int i = 0; i < n; i++) {
			x = in.next();
			base = in.next();
			r = new long[2];
			baseR = new String[2];
			if(base.equals("bin")) {
				r[0] = dec(x, "bin");
				baseR[0] = "dec";
				//r[1] = hex(x, "bin");
				baseR[1] = "hex";
			}
			
			System.out.printf("Case %d:\n%d %s\n %d %s\n\n",(i+1),r[0],baseR[0],r[1],baseR[1]);
		}
	}
	
	
	
	public static long dec(String x, String base) {
		String b = x;
		if(base.equals("hex")) {
			//b = bin(b);
		}
		
		b = inv(b);
		long r = 0;
		for(var i = b.length()-1; i >= 0; i--) {
			if(b.charAt(i) == '1') {
				r += pow(i);
			}
		}			
		return r;
		
	}
	
	
	public static String bin(String x, String base) {
		return "";
	}
	
	public static String hex(String x) {
		return "";
	}
	
	public static String inv(String x) {
		String inv = "";
		for(var i = 0; i < x.length(); i++) {
			char caracter_atual = x.charAt((x.length()-1-i));
			inv += caracter_atual;
		}
		return inv;
	}
	
	public static long pow(int e) {
		if(e == 0) {
			return 1;
		}
		
		int base = 2;
		long pow = base;
		
		for(var i = 1; i < e; i++) {
			pow *= base;
		}
		
		return pow;
	}
}
