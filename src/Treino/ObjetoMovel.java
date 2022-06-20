package Treino;

public class ObjetoMovel {
    protected int X = 0;
    protected int Y = 0;

    protected int velocidade = 0;
    protected double distancia = 0.0;

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public double getDistancia() {
        return distancia;
    }

    protected void move(int x, int y){
        distancia += Math.sqrt(Math.pow((X-x),2) + Math.pow((Y-y),2));
        X = x;
        Y = y;

    }

    protected void move(int x, int y, int v){
        distancia += Math.sqrt(Math.pow((X-x),2) + Math.pow((Y-y),2));
        X = x;
        Y = y;
        velocidade = v;
    }
}
