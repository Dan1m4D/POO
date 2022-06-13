package Aula_9.Ex1;

import Aula_6.Ex1.Date;
import Aula_6.Ex1.Pessoa;
import Aula_7.Ex2.DateND;
import java.util.*;

public class ALDemo {
    public static void main (String[] args) {
        ArrayList <Integer> c1= new ArrayList <>();
        for (int i= 10; i<= 100; i+=10)
            c1.add(i);

        System.out.println("Size: "+ c1.size());

        for (Integer integer : c1)
            System.out.println("Elemento: " + integer);
        
        ArrayList <String> c2= new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");

        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        if (c1.contains(20))
            System.out.println("The ArrayList cointains the element '20'");
        else
            System.out.println("Element not found");
        System.out.println(c2.indexOf("Vento"));
        c2.add("Vento");
        System.out.println(c2.lastIndexOf("Vento"));
        System.out.println(c2.set(1, "Raio"));
        System.out.println(c2); 
        System.out.println(c1.subList(4, 10));

        Set <Pessoa> c3 = new HashSet<>();
        Pessoa p1 = new Pessoa("cher", 1236721, new Date(12,12,1212));
        c3.add(p1);
        Pessoa p2 = new Pessoa("chear", 36721, new Date(12,12,1222));
        c3.add(p2);
        Pessoa p3 = new Pessoa("cheeer", 12126431, new Date(12,12,1232));
        c3.add(p3);
        Pessoa p4 = new Pessoa("ctyher", 123621, new Date(12,12,1242));
        c3.add(p4);
        Pessoa p5 = new Pessoa("cheasr", 1232321, new Date(12,12,1252));
        c3.add(p5);

        for (Pessoa pessoa : c3) {
            System.out.println(pessoa.toString());
        }

        Set<DateND> c4= new TreeSet<>();
        DateND d1 = new DateND (12,3,1999);
        c4.add(d1);
        DateND d2 = new DateND (1,4,1998);
        c4.add(d2);
        DateND d3 = new DateND (21,6,1999);
        c4.add(d3);
        DateND d4 = new DateND (12,3,2000);
        c4.add(d4);
        DateND d5 = new DateND (25,8,1987);
        c4.add(d5);

        for (DateND dateND : c4) {
            System.out.println(dateND.toString());
        }
    }
}
