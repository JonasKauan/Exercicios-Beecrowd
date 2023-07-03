import java.util.Scanner;
public class Ex1143 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 3; j++){
                System.out.print(pow(i,j));
                if(j < 3){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static int pow(int  b, int e){
        int p = b;
        for(int i = 1; i < e; i++){
            p *= b;
        }

        return p;
    }
}
