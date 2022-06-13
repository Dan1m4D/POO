package Aula_2;
import java.util.Scanner;

public class Ex6 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int Ts, Th, Thr, Tm, Tsr; 

        System.out.println("Tempo (em s)");
        Ts = scan.nextInt();
        
        Th = Ts / 3600;
        Thr = Ts % 3600;
        
        Tm = Thr / 60;
        Tsr = Thr % 60;

        System.out.println("Hora --> " + Th +":"+ Tm +":"+ Tsr);
        scan.close();



    }
}
