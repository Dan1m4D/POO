package Aula_4;
import java.util.Scanner;

public class Ex1 {

    public void lowerString(String s){
        System.out.println(s.toLowerCase());
    }


    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);

        System.out.println("String? (Parágrafo, frase ou palavra)");
        s = sc.next();

        System.out.println(s);
        System.out.println("================================");

        //Lower
        System.out.println("Lower case: " + s.toLowerCase());

        //Last char
        System.out.println("Last of us: " + s.substring(s.length() ,-1));

        //First 3
        System.out.println("First big 3: " + s.substring(0 ,3));

        //OUTROSP
        System.out.println("A sua string começa com Dan?: "+s.startsWith("Dan")); 
        System.out.println("A sua string acaba em ouco?: "+s.endsWith("ad"));
        System.out.println("A sua string contém a expressão paz?: "+s.contains("paz"));





        sc.close();
    }
    
}
