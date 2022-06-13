package Aula_11.Ex2;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        TreeMap<String, String> airlines = new TreeMap<>();
        TreeMap<String, ArrayList<String>> flights = new TreeMap<>();
        ArrayList<String> voosArray = new ArrayList<>();
        ArrayList<String> companhiasArray = new ArrayList<>();

        Scanner scVoo = new Scanner(new FileReader("src/Aula_11/Ex2/voos.txt"));
        while (scVoo.hasNextLine()) {
            voosArray.add(scVoo.nextLine());
        }
        Scanner scComp = new Scanner(new FileReader("src/Aula_11/Ex2/companhias.txt"));
        while (scComp.hasNextLine()) {
            String line = scComp.nextLine();
            companhiasArray.add(scComp.nextLine());
            String[] strAr = line.split("\t");
            airlines.put(strAr[0], strAr[1]);
        }
        for(String line : companhiasArray){
            String[] strAr = line.split("\t");
            airlines.put(strAr[0], strAr[1]);
        }

        for(String line : voosArray){
            //Insert the company's name into the voosArray from the beggining
            for(String sigla : airlines.keySet()) {
                if (line.contains(sigla))
                    line += airlines.get(sigla);
            }
            ArrayList<String> info = new ArrayList<>();
            String[] strAr = line.split("\t");
            String key = strAr[0];
            for(int i = 1;i < strAr.length; i++ )
                info.add(strAr[i]);
            flights.put(key, info);
        }
        
        System.out.println(airlines);
        System.out.println(flights);

        System.out.printf("""
                %-15s %-15s %-20s %-20s %-15s %-15s
                --------------------------------------------------------------------------------------------------------
                """, "Hora", "Voo", "Companhia", "Origem", "Atraso", "Observações");

        for (String voo : flights.keySet()){
            if(flights.get(voo).size()<4)
                System.out.printf("""
                    %-15s %-15s %-20s %-20s %-15s 
                    """, voo, flights.get(voo).get(0), flights.get(voo).get(2),flights.get(voo).get(1), "404");
            else
                System.out.printf("""
                    %-15s %-15s %-20s %-20s %-15s 
                    """, voo, flights.get(voo).get(0), flights.get(voo).get(3),flights.get(voo).get(1),flights.get(voo).get(2), "404");
        }



    }
}
