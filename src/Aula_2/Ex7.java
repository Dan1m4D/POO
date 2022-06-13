package Aula_2;
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("P1x?");
        double x1 = scan.nextInt();

        System.out.println("P1y?");
        double y1 = scan.nextInt();

        System.out.println("P2x?");
        double x2 = scan.nextInt();

        System.out.println("P2y?");
        double y2 = scan.nextInt();

        double deltaX = Math.pow(x2 - x1, 2);
        double deltaY = Math.pow(y2 - y1, 2);
        
        double d = Math.sqrt(deltaX + deltaY);

        System.out.println("D = " + d);
        scan.close();
    }
    
}
