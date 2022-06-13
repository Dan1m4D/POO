package Aula_7.Ex1;

public abstract class Forma {
    public String cor;

    public abstract double area();
    public abstract double perimetro();

    public void setCor(String cor){
        this.cor = cor;
    };
    
    public String getCor(String cor){
        return this.cor;
    };

    @Override
    public String toString() {
        return String.format("Cor: %s", this.cor);
    };
}

