package Aula_2;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("N?");
        double km = scan.nextDouble();

        double miles = km/1.609;

        System.out.println(km + " ---> " + miles);
        scan.close();
    }
    
}
