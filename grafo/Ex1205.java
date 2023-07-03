import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.io.*;

public class Ex1205 {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("/home/jonnas/Documentos/git/Exercicios-Beecrowd/Debug/1205.txt");
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(file);
        while(in.hasNextLine()){
            int pontos = in.nextInt();
            int rotas = in.nextInt();
            int balas = in.nextInt();
            double probabilidade_matar = in.nextDouble();

            ArrayList<Vertice> lista_pontos = new ArrayList<>();
            for(int i = 0; i < pontos; i++){
                lista_pontos.add(new Vertice(i));
            }

            for(int contador = 0; contador < rotas; contador++){
                int i = in.nextInt() - 1;
                int j = in.nextInt() - 1;
                lista_pontos.get(i).pontos.add(lista_pontos.get(j));
                lista_pontos.get(j).pontos.add(lista_pontos.get(i));
            }

            int a = in.nextInt();
            for(int i = 0; i < a; i++){
                int soldado_i = in.nextInt() - 1;
                lista_pontos.get(soldado_i).soldados++;
            }

            int localizacao_inicial = in.nextInt() - 1;
            int destino = in.nextInt() - 1;

            ArrayList<Vertice> rotas_calculadas = calcular_rota(lista_pontos,localizacao_inicial,destino);
            int quantidade_soldados = 0;
            for(Vertice ponto : rotas_calculadas){
                if(ponto.vertice == destino){quantidade_soldados = ponto.distancia;}
            }

            double probabilidade_chegada = 0.0;
            if(quantidade_soldados == 0){
                probabilidade_chegada = 1.0;
            }else if(balas >= quantidade_soldados){
                probabilidade_chegada = pow(probabilidade_matar, quantidade_soldados);
            }

            System.out.printf("%.3f\n",probabilidade_chegada);
        }
    }

    public static ArrayList<Vertice> calcular_rota(ArrayList<Vertice> lista_vertices, int localizacao_inicial, int destino) {
        ArrayList<Vertice> conjunto_solucao = new ArrayList<>();
        Fila f = new Fila(lista_vertices);
        Vertice ponto_atual = f.lista.get(localizacao_inicial);
        ponto_atual.distancia = ponto_atual.soldados;
        while(!f.isEmpty()){
            ponto_atual = extrair_minimo(f.lista);
            int i_ponto = 0;
            for(int i = 0; i < f.lista.size(); i++){
                if(f.lista.get(i).vertice == ponto_atual.vertice){
                    i_ponto = i;
                }
            }
            if(ponto_atual.pontos.size() > 0){
                f.lista = relaxar(i_ponto, f.lista);
            }
            conjunto_solucao.add(f.dequeue(i_ponto));
        }
        return conjunto_solucao;
    }
    public static ArrayList<Vertice> relaxar(int i_ponto, ArrayList<Vertice> lista){
        for(Vertice ponto_adj : lista.get(i_ponto).pontos){
            if(ponto_adj.soldados + lista.get(i_ponto).distancia < ponto_adj.distancia){
                ponto_adj.pi = lista.get(i_ponto).vertice;
                ponto_adj.distancia = ponto_adj.soldados + lista.get(i_ponto).distancia;
            }
        }
        return lista;
    }


    public static Vertice extrair_minimo(ArrayList<Vertice> lista) {
        Vertice min = lista.get(0);
        for (Vertice atual : lista) {
            if (atual.distancia < min.distancia) {
                min = atual;
            }
        }

        return min;
    }

    public static double pow(double b, long e){
        double p = b;
        for(int i = 1; i < e; i++){
            p *= b;
        }
        return p;
    }
}

class Fila{
    ArrayList<Vertice> lista;
    Fila(ArrayList<Vertice> lista){this.lista = lista;}
    public Vertice dequeue(int i){
        Vertice removed = lista.get(i);
        lista.remove(i);
        return removed;
    }

    public boolean isEmpty(){return(lista.size() == 0);}
}

class Vertice{
    Vertice(int vertice){this.vertice = vertice;}
    int vertice;
    int soldados = 0;
    int distancia = Integer.MAX_VALUE;
    int pi = -1;
    ArrayList<Vertice> pontos = new ArrayList<>();
}