package Aula_8.Ex1;

public class Motociclo extends Veiculo {
    private String tipo;

    public Motociclo(String matricula, String marca, String modelo, double cv, String tipo){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.tipo = tipo;
    }

    private boolean checkTipo(String tipo){
        if (tipo.equalsIgnoreCase("Estrada") || tipo.equalsIgnoreCase("Desportivo"))
           return true;
        else
            return false;
    }

    public void setTipo(String tipo) {
        if (checkTipo(tipo))
            this.tipo = tipo;
        else
            System.out.println("Tipo inválido");
    }

    public String getTipo() {return this.tipo;}

    @Override
    public String toString() {
        return String.format("MOTOCICLO\n=======================\nMatrícula: %s\nMarca: %s\nModelo: %s\nPotencia(Cv): %.2f Cv\nTipo: %s\nKm Efetuados: %dkm\nUltima viagem: %skm",this.matricula, this.marca, this.modelo, this.cv, this.tipo, this.TotalKm, this.TripKm);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;

        if (!(super.equals(o)))
            return false;

        if (!(o instanceof Motociclo)) {
            return false;
        }
        
        Motociclo m = (Motociclo) o;
        
        return tipo.equalsIgnoreCase(m.tipo);
    }
}
