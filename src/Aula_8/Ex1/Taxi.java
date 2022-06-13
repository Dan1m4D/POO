package Aula_8.Ex1;

public class Taxi extends ALigeiro {
    int nLicense;
    public Taxi(String matricula, String marca, String modelo, double cv, int nQuadro, double c, int nLicense){
        super(matricula, marca, modelo, cv, nQuadro, c);
        this.nLicense = nLicense;
    }

    public void setNLicense(int n){
        this.nLicense = n;
    }

    public int getNLicense() {return this.nLicense;}

    @Override
    public String toString() {
        return String.format("TAXI\n=======================\nMatrícula: %s\nMarca: %s\nModelo: %s\nPotencia(Cv): %.2f Cv\nNº Quadro: %d\nCapacidade da Bagageira: %.2fL\nNº Licensa: %d\nKm Efetuados: %dkm\nUltima viagem: %skm",this.matricula, this.marca, this.modelo, this.cv, this.nQuadro, this.cBag, this.nLicense, this.TotalKm, this.TripKm);
    }

}
