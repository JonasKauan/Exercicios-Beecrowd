import java.util.Scanner;
public class Ex1113 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            int x = in.nextInt();
            int y = in.nextInt();
            if(x == y){break;}
            String ans = "Decrescente";
            if(x < y){ans = "Crescente";}
            System.out.println(ans);
        }
    }
}