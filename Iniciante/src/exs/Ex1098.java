package exs;
import java.text.DecimalFormat;
public class Ex1098 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.0");
		for(double i = 0; i < 2; i += 0.2) {
			for(double j = 1 + i; j <= 3 + i; j++) {
				if(df.format(i).endsWith("0")) {
					System.out.printf("I=%.0f J=%.0f\n",i,j);
				}else {
					System.out.printf("I=%.1f J=%.1f\n",i,j);
				}
			}
		}
	}
}