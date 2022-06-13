package Aula_8.Ex1;

public class Pesado extends Automovel {
    protected double peso;

    public Pesado(String matricula, String marca, String modelo, Double cv, Integer nQuadro, double peso){
        super(matricula, marca, modelo, cv, nQuadro);
        this.peso = peso;
    }

    protected void setPeso(double peso){
        this.peso = peso;
    }

    protected double getPeso(){return this.peso;}

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;

        if (!(super.equals(o)))
            return false;

        if (!(o instanceof Pesado)) {
            return false;
        }
        
        Pesado p = (Pesado) o;
        
        return Double.compare(peso, p.peso) == 0;
    }
}
