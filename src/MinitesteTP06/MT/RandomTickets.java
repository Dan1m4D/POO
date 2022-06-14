package MinitesteTP06.MT;

import java.util.*;
import java.io.*;

public class RandomTickets {
    public HashMap<String, Integer> bilhetes = new HashMap<>();
    public HashMap<String, HashMap<String, Integer>> winners = new HashMap<>();
    public ArrayList<String> festvals = new ArrayList<>();

    Scanner sc;
    
    public RandomTickets() throws FileNotFoundException {
        sc = new Scanner(new FileReader("src/MinitesteTP06/MT/Lista_festivais.txt"));
        sc.nextLine();
        while (sc.hasNextLine()) {
            String [] str = sc.nextLine().split("\\t");
            bilhetes.put(str[2], Integer.parseInt(str[4]));
        }
        sc.close();
    }

    public HashMap<String, HashMap<String, Integer>> getRandomTicket(Pessoa p){
        festvals.addAll(bilhetes.keySet());
        int max = 2;
        int min = 0;
        int range = max - min + 1;
        int nbilhetes = (int)(Math.random() * range) + min;

        if (nbilhetes>0){
            max = 5;
            range = max - min + 1;
            int festIndex = (int) (Math.random() * range) + min;

            String fest = festvals.get(festIndex);
            HashMap<String, Integer> ticketsPair = new HashMap<>();
            ticketsPair.put(fest, nbilhetes);
            winners.put(p.nome, ticketsPair);

            int maxbilhetes = bilhetes.get(fest);
            int restbilhetes = maxbilhetes - nbilhetes;
            bilhetes.put(fest, restbilhetes);
        }

        return winners;
    }

    public void listPessoas(){
        System.out.println("---------------------------------------------------------");
        System.out.println("WINNERS:");
        for (String p: winners.keySet()) {
            System.out.println(p);

        }
        System.out.println("---------------------------------------------------------\n");
    }

    public void listAvailableTickets(){
        for (String p: bilhetes.keySet())
            System.out.printf("%-23s : %-3s tickets available\n", p, bilhetes.get(p));
    }

    
}
