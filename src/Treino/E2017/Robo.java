package Treino.E2017;

public class Robo extends ObjetoMovel implements Comparable<Robo>{
    private int X;
    private int Y;
    private int V;

    private String id;
    TipoJogador tipo;
    public int Golos = 0;

    public Robo(String id, TipoJogador tipo, int x, int y) {
        X = x;
        Y = y;
        this.id = id;
        this.tipo = tipo;
    }

    public void marcaGolo(){
        Golos ++;
    }

    @Override
    public int getX() {
        return X;
    }

    @Override
    public int getY() {
        return Y;
    }

    public int getV() {
        return V;
    }

    public String getId() {
        return id;
    }

    public TipoJogador getTipo() {
        return tipo;
    }

    public int getGolos() {
        return Golos;
    }

    @Override
    public int compareTo(Robo r){
        return this.id.compareTo(r.id);
    }

    @Override
    public String toString(){
        return String.format("""
                id = %s, tipo = %s *;*""", this.id, this.tipo);
    }
}
