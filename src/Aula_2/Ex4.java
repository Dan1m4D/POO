package Aula_2;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Montante Investido?");
        float MoneyIn = scan.nextFloat();

        System.out.println("Taxa de juros Mensal?");
        float TaxaMensal = scan.nextFloat();


        
        for (int i = 1; i<=3; i++){
            float Inv = MoneyIn * (TaxaMensal/100);
            MoneyIn += Inv;
        }

        System.out.println("Montante Total = " + MoneyIn);

        scan.close();      
    }
    
}
