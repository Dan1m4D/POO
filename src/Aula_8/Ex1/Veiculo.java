package Aula_8.Ex1;

public abstract class Veiculo implements KmPercorridosInterface {
    protected String matricula, marca, modelo;
    protected Double cv;
    protected int km, TripKm = 0, TotalKm = 0;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCv(Double cv){
        this.cv = cv;
    }

    public String getMatricula() {return this.matricula;}
    public String getMarca() {return this.marca;}
    public String getModelo() {return this.modelo;}
    public Double getCv() {return this.cv;}

    public void trajeto(int km){
        this.TripKm = km;
        this.TotalKm += this.TripKm;
    }

    public int ultimoTrajeto() {
        return this.TripKm;
    }

    public int distanciaTotal() {
        return this.TotalKm;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
 
        if (!(o instanceof Veiculo)) {
            return false;
        }
        
        Veiculo v = (Veiculo) o;
        
        return matricula.equalsIgnoreCase(v.matricula)
                && marca.equalsIgnoreCase(v.marca)
                && modelo.equalsIgnoreCase(v.modelo)
                && Double.compare(cv, v.cv) == 0;

        
    }
}
