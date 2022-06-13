package Aula_8.Ex1;

public class ALigeiro extends Automovel {
    protected Double cBag;
    
    public ALigeiro(String matricula, String marca, String modelo, Double cv, int nQuadro, double c){
        super(matricula, marca, modelo, cv, nQuadro);
        this.cBag = c;
    }

    public void setCBag(Double c){
        this.cBag = c;
    }

    public double getCBag() {return this.cBag;}

    @Override
    public String toString() {
        return String.format("AUTOMOVEL LIGEIRO\n=======================\nMatrícula: %s\nMarca: %s\nModelo: %s\nPotencia(Cv): %.2f Cv\nNº Quadro: %d\nCapacidade da Bagageira: %.2fL\nKm Efetuados: %dkm\nUltima viagem: %skm",this.matricula, this.marca, this.modelo, this.cv, this.nQuadro, this.cBag,this.TotalKm, this.TripKm);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;

        if (!(super.equals(o)))
            return false;

        if (!(o instanceof ALigeiro)) {
            return false;
        }
        
        ALigeiro a = (ALigeiro) o;
        
        return Double.compare(cBag, a.cBag) == 0;
    }

}
