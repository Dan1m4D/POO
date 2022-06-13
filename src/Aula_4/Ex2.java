package Aula_4;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input da string (frase btw): ");
        s = sc.nextLine();

        System.out.println("A string tem " + countDigits(s) + " carateres numéricos.");
        System.out.println("A string tem " + spaceCount(s) + " espaços");
        System.out.println("A string só tem minúsculas? " + MinCheck(s));
        System.out.println("Sem espaços repetidos: " + soloSpaces(s));
        System.out.println("A String é um palíndromo? " + isPalindromo(s));

        sc.close();
    }

    public static int countDigits(String s){
        int d = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (Character.isDigit(c))
            d++;
        }
        return d;
    }

    public static int spaceCount (String s){
        int space = 0;
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' ')
            space++;
        }
        return space;
    }

    public static boolean MinCheck(String s){
        for(int i = 0; i<s.length(); i++ ){
            char c = s.charAt(i);
            if (Character.isUpperCase(c)){
                return false;
            }
        }
        return true;
    }

    public static String soloSpaces(String s){
        s = s.replaceAll("\s+", " ");
        return s;
    }

    public static boolean isPalindromo(String s){
        String p = "";
        s.toLowerCase().trim().replaceAll("\s+", "");
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            p += ch;
        }
        
        return s.equals(p);
    }
}
