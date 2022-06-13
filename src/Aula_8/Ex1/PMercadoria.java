package Aula_8.Ex1;

public class PMercadoria extends Pesado {
    private double cMax;

    public PMercadoria(String matricula, String marca, String modelo, Double cv, Integer nQuadro, double peso, double cMax){
        super(matricula, marca, modelo, cv, nQuadro, peso);
        this.cMax = cMax;
    }

    public void setCMax(double cMax){
        this.cMax = cMax;
    }

    public double getCMax(){return this.cMax;}

    @Override
    public String toString() {
        return String.format("PESADO DE MERCADORIAS\n=======================\nMatrícula: %s\nMarca: %s\nModelo: %s\nPotencia(Cv): %.2f Cv\nNº Quadro: %d\nPeso: %.2fkg\nCarga Maxima: %.2fkg\nKm Efetuados: %dkm\nUltima viagem: %skm",this.matricula, this.marca, this.modelo, this.cv, this.nQuadro, this.peso, this.cMax, this.TotalKm, this.TripKm);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;

        if (!(super.equals(o)))
            return false;

        if (!(o instanceof PMercadoria)) {
            return false;
        }
        
        PMercadoria pm = (PMercadoria) o;
        
        return Double.compare(cMax, pm.cMax) == 0;
    }
}
