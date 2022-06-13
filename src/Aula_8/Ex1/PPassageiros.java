package Aula_8.Ex1;

public class PPassageiros extends Pesado {
    private int nPassageiros;

    public PPassageiros(String matricula, String marca, String modelo, Double cv, Integer nQuadro, double peso, int nPassageiros) {
        super(matricula, marca, modelo, cv, nQuadro, peso);
        this.nPassageiros = nPassageiros;
    }    

    public void setNPassageiros(int nPassageiros){
        this.nPassageiros = nPassageiros;
    }

    public int getNPassageiros(){return this.nPassageiros;}

    @Override
    public String toString() {
        return String.format("PESADO DE PASSAGEIROS\n=======================\nMatrícula: %s\nMarca: %s\nModelo: %s\nPotencia(Cv): %.2f Cv\nNº Quadro: %d\nPeso: %.2fkg\nLotação Maxima: %d passageiros\nKm Efetuados: %dkm\nUltima viagem: %skm",this.matricula, this.marca, this.modelo, this.cv, this.nQuadro, this.peso, this.nPassageiros, this.TotalKm, this.TripKm);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;

        if (!(super.equals(o)))
            return false;

        if (!(o instanceof PPassageiros)) {
            return false;
        }
        
        PPassageiros pp = (PPassageiros) o;
        
        return Integer.compare(nPassageiros, pp.nPassageiros) == 0;
    }
}
