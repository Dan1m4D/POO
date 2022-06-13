package Aula_2;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Velocidade em 1 (m/s)?");
        float v1 = scan.nextFloat();
        System.out.println("Distância em 1 (m)?");
        float d1 = scan.nextFloat();
        float t1 = d1/v1;

        
        System.out.println("Velocidade em 1(m/s)?");
        float v2 = scan.nextFloat();
        System.out.println("Distância em 1 (m)?");
        float d2 = scan.nextFloat();
        float t2 = d2/v2;

        float vm = (d2+d1)/(t2+t1);

        System.out.format("Vm = %.3f m/s2", vm);
        scan.close();
    }
    
}
