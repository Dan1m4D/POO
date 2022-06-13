package Aula_2;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Temp?");
        double C = scan.nextDouble();
        double F = 1.8*C + 32;

        System.out.println(C + "ºC ----> " + F + "ºF");
        scan.close();
    }
    
}
