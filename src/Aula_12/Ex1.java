package Aula_12;
import java.io.*;
import java.util.*;

public class Ex1 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList <String> list = new ArrayList<String>();
        Set <String> set = new HashSet<String>();
        Scanner fin = new Scanner(new File("src/Aula_12/w12ex1.txt"));
        int dup = 0;
        
        while(fin.hasNextLine()) {
            String[] strAr = fin.nextLine().split("[\\,\\.\\s+]");
            for (String str : strAr)
                list.add(str);
        }
        //System.out.println(list);
        int size = list.size();

        for(String str : list){
            if (set.add(str) == false)
                dup++;
        }
        System.out.println("Numero de palavras: " + size);
        System.out.println("Numero de palavras duplicadas: " + dup);
    }
}
