package Aula_11.Ex2;

import java.io.FileReader;
import java.io.IOException;
import java.lang.invoke.StringConcatFactory;
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
            String hora = strAr[0];
            String voo = strAr[1];
            String origin = strAr[2];
            String comp;
            String atraso;
            if (strAr.length > 4){
                atraso = strAr[3];
                comp = strAr[4];
            }
            else{
                atraso = "00:00";
                comp = strAr[3];
            }
            //System.out.println(newHora(hora, atraso));
            info.add(voo);
            info.add(comp);
            info.add(origin);
            info.add(atraso);
            //info.add(obs);
            //%-15s

            flights.put(hora, info);
        }
        
        System.out.println(airlines);
        System.out.println(flights);

        System.out.printf("""
                %-15s %-15s %-25s %-25s %-15s %-15s
                -------------------------------------------------------------------------------------------------------------------------
                """, "Hora", "Voo", "Companhia", "Origem", "Atraso", "Observações");

        for (String voo : flights.keySet()) {
            System.out.printf("""
                    %-15s %-15s %-20s %-20s  
                    """, voo, flights.get(voo).get(0), flights.get(voo).get(1), flights.get(voo).get(2), flights.get(voo).get(3) );
        }
    }
//,flights.get(voo).get(4)
    public static String[] newHora(String hora, String atraso){
        String [] hr = hora.split(":");
        String [] atr = hora.split(":");
        int [] h = new int[2];
        int [] a = new int[2];

        return hr;
        /*for (int i = 0; i<2; i++){
            h[i] = Integer.parseInt(hr[i]);
            a[i] = Integer.parseInt(atr[i]);
        }

        int newh, newm;
        if(a[1] > h[1]) {
            int c = a[1]/h[1];
            int r = a[1]%h[1];
            newh = h[0] - c;
            newm = h[1]-(r*60);
        }
        else{
            newh = h[0]-a[0];
            newm = h[1]-a[1];

        }
        return String.format("%s:%s", newh, newm);*/
    }
}
