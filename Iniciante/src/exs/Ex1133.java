import java.util.Scanner;
public class Ex1133 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int inf = x;
        int sup = y;
        if(x > y){
            inf = y;
            sup = x;
        }

        for(int i = inf+1; i < sup; i++){
            if(i % 5 == 2 || i % 5 == 3){System.out.println(i);}
        }
    }
}