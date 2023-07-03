import java.util.Scanner;
public class Ex1146 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            int x = in.nextInt();
            if(x == 0){break;}
            for(int i = 1; i <= x; i++){
                if(i == x){System.out.println(i);}
                else{System.out.print(i+" ");}
            }
        }
    }
}