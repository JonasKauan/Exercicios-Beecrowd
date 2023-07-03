import java.util.Scanner;
public class Ex1144 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < 2; j++){
                System.out.printf("%d %d %d\n",i,(i*i+j),(i*i*i+j));
            }
        }
    }
}