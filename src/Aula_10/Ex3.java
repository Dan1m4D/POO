package Aula_10;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        HashMap <Character, Integer> charLst = new HashMap<>();
        HashMap <Character, ArrayList<Integer>> charPos = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        //Start
        System.out.println("Insert your word/phrase:");
        String s = sc.nextLine();
        int newCounter;
        for (char c : s.toCharArray()){
            Integer counter = charLst.get(c);
            if (charLst.get(c) == null)
                newCounter = 1;
            else
                newCounter = counter + 1;
            charLst.put(c, newCounter);
        }

        for(char c : s.toCharArray()){
            ArrayList<Integer> pos = new ArrayList<>();
            pos.clear();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c)
                    pos.add(i);
                charPos.put(c, pos);
            }

        }

        System.out.println("""
                    _________________________________
                    | <<CHARS IN THE STRING>>
                    |  char | Freq | Positions
                    """);
        for (char i : charLst.keySet()){
            System.out.printf("""
                    | -> %s : [%s]  :: %s
                    """, i, charLst.get(i), charPos.get(i));
        }
        System.out.print("""
                    |
                    _________________________________
                    """);
    }
}
