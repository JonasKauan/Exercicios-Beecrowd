import java.util.Scanner;

public class Ex1232 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] cubo = new int[6][9];
        String movimentos;

        int face = 1;

        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < cubo[i].length; j++) {
                cubo[i][j] = face;
                face++;
            }
        }

        while(in.hasNext()) {
            movimentos = in.next();
            int aplicacoes = calcular_aplicacoes(movimentos, cubo);
            System.out.println(aplicacoes);
        }
    }

    public static int calcular_aplicacoes(String movimentos, int[][]cubo) {
        boolean arrumado = false;
        int aplicacoes = 0;
        do {
            for(int i = 0; i < movimentos.length(); i++){
                switch(movimentos.charAt(i)){
                    case 'd':{
                        for(int j = 0; j < 3; j++) {
                            cubo = eixo_d(cubo);
                        }
                        break;
                    }

                    case 'D':{
                        cubo = eixo_d(cubo);
                        break;
                    }

                    case 'l':{
                        for(int j = 0; j < 3; j++) {
                            cubo = eixo_l(cubo);
                        }

                        break;
                    }

                    case 'L':{
                        cubo = eixo_l(cubo);
                        break;
                    }

                    case 'u':{
                        for(int j = 0; j < 3; j++) {
                            cubo = eixo_u(cubo);
                        }

                        break;
                    }

                    case 'U':{
                        cubo = eixo_u(cubo);
                        break;
                    }

                    case 'f':{
                        for(int j = 0; j < 3; j++) {
                            cubo = eixo_f(cubo);
                        }

                        break;
                    }

                    case 'F':{
                        cubo = eixo_f(cubo);
                        break;
                    }

                    case 'r':{
                        for(int j = 0; j < 3; j++) {
                            cubo = eixo_r(cubo);
                        }

                        break;
                    }

                    case 'R':{
                        cubo = eixo_r(cubo);
                        break;
                    }

                    case 'b':{
                        for(int j = 0; j < 3; j++) {
                            cubo = eixo_b(cubo);
                        }

                        break;
                    }

                    case 'B':{
                        cubo = eixo_b(cubo);
                    }
                }
            }

            int face = 1;
            arrumado = true;

            for(int i = 0; i < 6; i++) {
                for(int j = 0; j < cubo[i].length; j++) {
                    if(cubo[i][j] != face) {
                        arrumado = false;
                        break;
                    }

                    face++;
                }
            }
            aplicacoes++;
        }while(!arrumado);

        return aplicacoes;
    }

    public static int[][] eixo_f(int[][] cubo) {
        int[] aux = new int[6], f_aux = new int[9];

        for(int i = 0; i < 9; i++) {
            f_aux[i] = cubo[0][i];
        }

        cubo[0][0] = f_aux[6];
        cubo[0][1] = f_aux[3];
        cubo[0][2] = f_aux[0];
        cubo[0][3] = f_aux[7];
        cubo[0][5] = f_aux[1];
        cubo[0][6] = f_aux[8];
        cubo[0][7] = f_aux[5];
        cubo[0][8] = f_aux[2];

        aux[0] = cubo[3][2];
        aux[1] = cubo[3][5];
        aux[2] = cubo[3][8];
        aux[3] = cubo[4][6];
        aux[4] = cubo[4][7];
        aux[5] = cubo[4][8];

        cubo[3][2] = cubo[5][0];
        cubo[3][5] = cubo[5][1];
        cubo[3][8] = cubo[5][2];

        cubo[5][0] = cubo[1][6];
        cubo[5][1] = cubo[1][3];
        cubo[5][2] = cubo[1][0];

        cubo[4][6] = aux[2];
        cubo[4][7] = aux[1];
        cubo[4][8] = aux[0];

        cubo[1][0] = aux[3];
        cubo[1][3] = aux[4];
        cubo[1][6] = aux[5];
        return cubo;
    }

    public static int[][]eixo_r(int[][] cubo) {
        int[] aux = new int[6], r_aux = new int[9];
        for(int i = 0; i < 9; i++) {
            r_aux[i] = cubo[1][i];
        }

        cubo[1][0] = r_aux[6];
        cubo[1][1] = r_aux[3];
        cubo[1][2] = r_aux[0];
        cubo[1][3] = r_aux[7];
        cubo[1][5] = r_aux[1];
        cubo[1][6] = r_aux[8];
        cubo[1][7] = r_aux[5];
        cubo[1][8] = r_aux[2];

        aux[0] = cubo[4][2];
        aux[1] = cubo[4][5];
        aux[2] = cubo[4][8];
        aux[3] = cubo[0][2];
        aux[4] = cubo[0][5];
        aux[5] = cubo[0][8];

        cubo[0][2] = cubo[5][2];
        cubo[0][5] = cubo[5][5];
        cubo[0][8] = cubo[5][8];

        cubo[5][2] = cubo[2][6];
        cubo[5][5] = cubo[2][3];
        cubo[5][8] = cubo[2][0];

        cubo[2][0] = cubo[4][8];
        cubo[2][3] = cubo[4][5];
        cubo[2][6] = cubo[4][2];

        cubo[4][2] = aux[3];
        cubo[4][5] = aux[4];
        cubo[4][8] = aux[5];
        return cubo;
    }

    public static int[][] eixo_b(int[][] cubo) {
        int[] aux = new int[6], b_aux = new int[9];
        int[] f = cubo[0], r = cubo[1], l = cubo[3], u = cubo[4], d = cubo[5];

        for(int i = 0; i < 9; i++) {
            b_aux[i] = cubo[2][i];
        }

        cubo[2][0] = b_aux[6];
        cubo[2][1] = b_aux[3];
        cubo[2][2] = b_aux[0];
        cubo[2][3] = b_aux[7];
        cubo[2][5] = b_aux[1];
        cubo[2][6] = b_aux[8];
        cubo[2][7] = b_aux[5];
        cubo[2][8] = b_aux[2];

        aux[0] = cubo[4][0];
        aux[1] = cubo[4][1];
        aux[2] = cubo[4][2];

        cubo[4][0] = r[2];
        cubo[4][1] = r[5];
        cubo[4][2] = r[8];

        cubo[1][2] = cubo[5][8];
        cubo[1][5] = cubo[5][7];
        cubo[1][8] = cubo[5][6];

        cubo[5][6] = cubo[3][0];
        cubo[5][7] = cubo[3][3];
        cubo[5][8] = cubo[3][6];

        cubo[3][0] = aux[2];
        cubo[3][3] = aux[1];
        cubo[3][6] = aux[0];
        return cubo;
    }

    public static int[][] eixo_d(int[][] cubo){
        int[] aux = new int[6], d_aux = new int[9];

        for(int i = 0; i < 9; i++) {
            d_aux[i] = cubo[5][i];
        }

        cubo[5][0] = d_aux[6];
        cubo[5][1] = d_aux[3];
        cubo[5][2] = d_aux[0];
        cubo[5][3] = d_aux[7];
        cubo[5][5] = d_aux[1];
        cubo[5][6] = d_aux[8];
        cubo[5][7] = d_aux[5];
        cubo[5][8] = d_aux[2];

        aux[0] = cubo[3][6];
        aux[1] = cubo[3][7];
        aux[2] = cubo[3][8];
        aux[3] = cubo[0][6];
        aux[4] = cubo[0][7];
        aux[5] = cubo[0][8];

        cubo[3][6] = cubo[2][6];
        cubo[3][7] = cubo[2][7];
        cubo[3][8] = cubo[2][8];

        cubo[2][6] = cubo[1][6];
        cubo[2][7] = cubo[1][7];
        cubo[2][8] = cubo[1][8];

        cubo[0][6] = aux[0];
        cubo[0][7] = aux[1];
        cubo[0][8] = aux[2];

        cubo[1][6] = aux[3];
        cubo[1][7] = aux[4];
        cubo[1][8] = aux[5];

        return cubo;
    }

    public static int[][] eixo_u(int[][] cubo){
        int[] aux = new int[6], u_aux = new int[9];

        for(int i = 0; i < 9; i++) {
            u_aux[i] = cubo[4][i];
        }

        cubo[4][0] = u_aux[6];
        cubo[4][1] = u_aux[3];
        cubo[4][2] = u_aux[0];
        cubo[4][3] = u_aux[7];
        cubo[4][5] = u_aux[1];
        cubo[4][6] = u_aux[8];
        cubo[4][7] = u_aux[5];
        cubo[4][8] = u_aux[2];

        aux[0] = cubo[3][0];
        aux[1] = cubo[3][1];
        aux[2] = cubo[3][2];
        aux[3] = cubo[1][0];
        aux[4] = cubo[1][1];
        aux[5] = cubo[1][2];

        cubo[3][0] = cubo[0][0];
        cubo[3][1] = cubo[0][1];
        cubo[3][2] = cubo[0][2];

        cubo[1][0] = cubo[2][0];
        cubo[1][1] = cubo[2][1];
        cubo[1][2] = cubo[2][2];

        cubo[2][0] = aux[0];
        cubo[2][1] = aux[1];
        cubo[2][2] = aux[2];

        cubo[0][0] = aux[3];
        cubo[0][1] = aux[4];
        cubo[0][2] = aux[5];
        return cubo;
    }

    public static int[][] eixo_l(int[][] cubo){
        int[] aux = new int[6], l_aux = new int[9];

        for(int i = 0; i < 9; i++) {
            l_aux[i] = cubo[3][i];
        }

        cubo[3][0] = l_aux[6];
        cubo[3][1] = l_aux[3];
        cubo[3][2] = l_aux[0];
        cubo[3][3] = l_aux[7];
        cubo[3][5] = l_aux[1];
        cubo[3][6] = l_aux[8];
        cubo[3][7] = l_aux[5];
        cubo[3][8] = l_aux[2];

        aux[0] = cubo[4][0];
        aux[1] = cubo[4][3];
        aux[2] = cubo[4][6];
        aux[3] = cubo[0][0];
        aux[4] = cubo[0][3];
        aux[5] = cubo[0][6];

        cubo[4][0] = cubo[2][8];
        cubo[4][3] = cubo[2][5];
        cubo[4][6] = cubo[2][2];

        cubo[2][2] = cubo[5][6];
        cubo[2][5] = cubo[5][3];
        cubo[2][8] = cubo[5][0];

        cubo[0][0] = aux[0];
        cubo[0][3] = aux[1];
        cubo[0][6] = aux[2];

        cubo[5][0] = aux[3];
        cubo[5][3] = aux[4];
        cubo[5][6] = aux[5];
        return cubo;
    }
}