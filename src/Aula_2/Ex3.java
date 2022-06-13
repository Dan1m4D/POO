package Aula_2;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Massa de água?");
        float M = scan.nextFloat();

        System.out.println("Tempreatura inicial?");
        float Ti = scan.nextFloat();

        System.out.println("Temperatura final?");
        float Tf = scan.nextFloat();

        float deltaT = Tf - Ti;
        float Q = M*deltaT + 4184;

        System.out.println("Q = " + Q + "J");
        scan.close();
    }
}
