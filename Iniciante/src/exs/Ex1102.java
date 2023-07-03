import java.util.Scanner;
public class Ex1102 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m, n, soma;
        while(true){
            m = in.nextInt();
            n = in.nextInt();
            if(m <= 0 || n <= 0){break;}
            soma = 0;
            int inf = Math.min(m,n);
            int sup = Math.max(m,n);
            for(int i = inf; i <= sup; i++){
                System.out.print(i+" ");
                soma += i;
            }
            System.out.println("Sum="+soma);
        }
    }
}