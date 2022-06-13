package Aula_4;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        String s, a;
        String[] str;
        Scanner sc = new Scanner(System.in);
  
        System.out.println("Introduza uma frase:");
        s = sc.nextLine();
        
        str = s.trim().split(" "); 
        a = "";
        for (int i = 0; i < str.length; i++){
            if (str[i].length() > 3){
                String c = Character.toString(str[i].charAt(0)); 
                a += c;
            }
        }
        System.out.println(a.toUpperCase());
        sc.close();
      }
}
