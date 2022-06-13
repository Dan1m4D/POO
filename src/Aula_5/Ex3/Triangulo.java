package Aula_5.Ex3;

public class Triangulo {
    int lado1, lado2, lado3;

    public Triangulo(int l1, int l2, int l3){
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
    }
    
    private static boolean isValid(int l1,int l2,int l3){
        boolean valid = l1 + l2 >= l3 && l1 + l3 >= l2 && l2 + l3 >= l1;
        return valid;
    }

    @Override
    public String toString() {
        String str = "Triangulo: \nLado1: " + this.lado1 + ", \nLado2: " + this.lado2 + ", \nLado3: " + this.lado3;
        return str;
    }
    
}
