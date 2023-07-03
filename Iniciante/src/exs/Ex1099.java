import java.util.Scanner;
public class Ex1099 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, x, y, soma;
        n = in.nextInt();
        for(int i = 0; i < n; i++){
            x = in.nextInt();
            y = in.nextInt();
            int inf = Math.min(x,y);
            int sup = Math.max(x,y);
            soma = 0;
            for(int j = inf+1; j < sup; j++){
                if(j % 2 != 0){
                    soma += j;
                }
            }
            System.out.println(soma);
        }
    }
}
