package Aula_8.Ex1;

public class Automovel extends Veiculo {
    public int nQuadro;

    public Automovel(String matricula, String marca, String modelo, Double cv, Integer nQuadro){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.nQuadro = nQuadro;
    }
    
    
    protected void setNQuadro(int nQuadro) {
        this.nQuadro = nQuadro;
    }

    protected int getNQuadro() {return this.nQuadro;}

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;

        if (!(super.equals(o)))
            return false;

        if (!(o instanceof Automovel)) {
            return false;
        }
        
        Automovel a = (Automovel) o;
        
        return Integer.compare(nQuadro, a.nQuadro) == 0;
    }
}
