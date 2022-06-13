package Aula_10;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> ws = new ArrayList<>();
        ArrayList<String> S = new ArrayList<>();
        ArrayList<String> Alpha = new ArrayList<>();
        TreeSet<String> words = new TreeSet<>();

        Scanner input = new Scanner(new FileReader("test.txt"));
        while (input.hasNext()) {
            String word = input.next();
            words.add(word);
        }
        for (String w : words){
            if(w.length() > 2)
                ws.add(w);
            if(w.endsWith("s"))
                S.add(w);
            if(isAlpha(w))
                Alpha.add(w);
        }

        System.out.println("""
                .................................
                <<< ARRAYS FROM test.txt FILE >>>
                =================================""");
        System.out.println("""
                << ALL WORDS ARRAY >>
                ---------------------""");
        printArray(words);System.out.println("""
                ......................................
                << MORE THAN 2 LETTERS WORDS ARRAY >>
                --------------------------------------""");
        printArray(ws);
        System.out.println("""
                .............................
                << ENDS WITH S WORDS ARRAY >>
                -----------------------------""");
        printArray(S);
        System.out.println("""
                ..............................
                << ONLY LETTERS WORDS ARRAY >>
                ------------------------------""");
        printArray(Alpha);

    }

    public static boolean isAlpha(String w){
        boolean valid = true;
        for(char c : w.toCharArray()) {
            if (!Character.isLetter(c))
                valid = false;
        }
        return valid;
    }

    public static void printArray(Collection<String> a){
        for(String s : a){
            System.out.println("o>  " + s);
        }
    }
}
