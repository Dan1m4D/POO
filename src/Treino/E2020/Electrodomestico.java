package Treino.E2020;

public class Electrodomestico extends Produto{
    private String tipo;
    private String marca;
    private String modelo;
    private ClasseEnergetica classe;
    private double potencia;

    public Electrodomestico(String tipo, String marca, String modelo, double potencia, double precobase) {
        super(precobase);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public Electrodomestico(String tipo, String marca, String modelo, double precobase) {
        super(precobase);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public ClasseEnergetica getClasse() {
        return classe;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setClasse(ClasseEnergetica classe) {
        this.classe = classe;
    }

    @Override
    public String getDescricao(){
        return String.format("%s:%s/%s", tipo, marca, modelo);
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", classe=" + classe +
                ", potencia=" + potencia +
                "W}";
    }
}
