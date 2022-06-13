package Aula_4;
import java.util.Scanner;

public class Ex3Didi {
    public static void main(String[] args) {
        String s;
        StringBuilder a = new StringBuilder();
        String[] str;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza uma frase:");
        s = sc.next();
        
        str = s.split(" "); 
        for (int i = 0; i < str.length; i++){
            char c = str[i].charAt(0);
            if (str[i].length() > 3){ 
                c = Character.toUpperCase(c);
                a.append(c);
            }
        }

        System.out.println(a);
        sc.close();
    }
}
