package Treino.E2017;

public class Jogo {
    private Equipa e1;
    private Equipa e2;
    private Bola bola;

    private int [] tempototal;
    private int [] tempodecorrido;

    public Jogo(Equipa e1, Equipa e2, Bola bola, int t) {
        this.e1 = e1;
        this.e2 = e2;
        this.bola = bola;
       if (t>0){
           tempototal = tFormat(t);
       }
       else{
           System.out.println("Tempo inválido");
       }
    }

    private int[] tFormat(int t){
        int h = 0;
        int m = 0;
        int s = 0;

        h = t / 60;
        m = t % 60;
        s = m % 60;

        int[] tempo = {h, m, s};
        return tempo;
    }

    @Override
    public String toString(){
        return String.format("Jogo entre %s e %s", e1.nome, e2.nome);
    }
}
