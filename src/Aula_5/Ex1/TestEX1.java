package Aula_5.Ex1;
import java.util.Scanner;

public class TestEX1 {
    public static void main(String[] args) {
        Date date = new Date(2003, 4, 16);
        Scanner sc = new Scanner(System.in);
        int option;        
        
        do{
            System.out.println("Date Operations: ");
            System.out.println("1 - Create new Date");
            System.out.println("2 - Show current Date");
            System.out.println("3 - Increment Date");
            System.out.println("4 - Decrement Date");
            System.out.println("0 - Exit");
            System.out.println("Option? ");

            option = sc.nextInt();

            switch(option){
                case 0:
                    System.out.println("----------------------------------");
                    System.out.println("Bye!");
                    break;
                case 1:
                    System.out.println("----------------------------------");
                    System.out.println("Ano?");
                    int ano = sc.nextInt();

                    System.out.println("Mès?");
                    int mes = sc.nextInt();

                    System.out.println("Dia?");
                    int dia = sc.nextInt();

                    date.setDate(ano, mes, dia);
                    System.out.println(date.toString());
                    break;
                case 2:
                    System.out.println("----------------------------------");
                    System.out.println(date.toString());
                    break;
                case 3:
                    date.increment();
                    System.out.println(date.toString());
                    break;
                case 4:
                    date.decrement();
                    System.out.println(date.toString());
                    break;
            }
        }
        while (option != 0);

        sc.close();

    }
}