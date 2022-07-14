package Treino;

public class Bola extends ObjetoMovel {
    private int X;
    private int Y;
    private int V;

    private static int nbolas = 0;

    private CorDaBola cor;

    public Bola(CorDaBola cor) {
        this.cor = cor;
        nbolas ++;
    }

    public static int getnBolas() {
        return nbolas;
    }
}
