package Aula_2;
import java.util.Scanner;

public class Ex8 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Lado A?");
        double A = scan.nextDouble(); 

        System.out.println("Lado B?");
        double B = scan.nextDouble();

        double C = Math.sqrt(A * A + B * B);

        double alpha = Math.toDegrees(Math.acos(A/C));

        System.out.format("C = %.1f ;  alpha = %.1fº", C, alpha);
        scan.close();
    }
}
