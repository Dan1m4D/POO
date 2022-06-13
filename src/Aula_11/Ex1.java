package Aula_11;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        TreeMap <String, TreeMap<String, Integer>> words = new TreeMap<>();
        ArrayList<String> wordsArray = new ArrayList<>();

        Scanner fin = new Scanner(new FileReader("major.txt", StandardCharsets.UTF_8));
        fin.useDelimiter("[\\p{Punct}\\s+]");
        while (fin.hasNext()) {
            String word = fin.next();
            if (word.length()>2)
                wordsArray.add(word);
        }

        for(int i = 0; i<wordsArray.size()-1; i++){
            String key = wordsArray.get(i);
            String next = wordsArray.get(i+1);
            if (!words.containsKey(key)){
                TreeMap<String, Integer> map = new TreeMap<>();
                map.put(next, 1);
                words.put(key, map);
            }
            else{
                if (!words.get(key).containsKey(next))
                    words.get(key).put(next, 1);
                else{
                    int v = words.get(key).get(next);
                    v++;
                    words.get(key).put(next, v);
                }
            }
        }

        for(String key : words.keySet()){
            System.out.println(key + ":" + words.get(key).toString());
        }

    }

}
