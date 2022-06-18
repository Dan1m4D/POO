package MinitesteTP06.MT;

import java.util.*;
import java.io.*;

public class RandomTickets {
    public HashMap<String, Integer> bilhetes = new HashMap<>();
    public HashMap<String, HashMap<String, Integer>> winners = new HashMap<>();
    public HashMap<String, ArrayList<HashMap<String, Integer>>> contest = new HashMap<>();
    public ArrayList<String> festvals = new ArrayList<>();

    public ArrayList<HashMap<String, Integer>> list = new ArrayList<>();

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

        if (nbilhetes>0) {
            max = 5;
            range = max - min + 1;
            int festIndex = (int) (Math.random() * range) + min;
            String fest = festvals.get(festIndex);

            HashMap<String, Integer> ticketsPair = new HashMap<>();
            ticketsPair.put(fest, nbilhetes);

            if (contest.containsKey(p.nome)) {
                for (int i = 0; i < contest.get(p.nome).size(); i++) {
                    if (contest.get(p.nome).get(i).keySet() != ticketsPair.keySet()) {
                        list.add(ticketsPair);
                        winners.put(p.nome, ticketsPair);
                        System.out.println(ticketsPair);
                    }
                    else {
                        if (contest.get(p.nome).get(i).get(fest) <= 1 && nbilhetes <= 1) {
                            int n = contest.get(p.nome).get(i).get(fest) + nbilhetes;
                            ticketsPair.put(fest, n);
                            list.add(ticketsPair);
                            winners.put(p.nome, ticketsPair);
                            System.out.println(ticketsPair);
                        }
                    }
                    contest.put(p.nome, list);
                }

            }
            else {
                contest.put(p.nome, list);
                winners.put(p.nome, ticketsPair);
            }

        }
            /*

            int maxbilhetes = bilhetes.get(fest);
            int restbilhetes = maxbilhetes - nbilhetes;
            bilhetes.put(fest, restbilhetes);

            if(winners.containsKey(p.nome)){
                if(winners.get(p.nome).keySet() == ticketsPair.keySet()){
                    if (winners.get(p.nome).get(fest) <= 1 && nbilhetes <= 1) {
                        int n = winners.get(p.nome).get(fest) + nbilhetes;
                        ticketsPair.put(fest, n);
                        winners.put(p.nome, ticketsPair);
                    }
                }
            }
            else {
                ticketsPair.put(fest, nbilhetes);
                winners.put(p.nome, ticketsPair);
            }


            contest.put(p.nome, winners);
            if(contest.containsKey(p.nome)){
                if(contest.get(p.nome).keySet() == ticketsPair.keySet()) {
                    if (winners.get(p.nome).get(fest) <= 1 && nbilhetes <= 1) {
                        int n = winners.get(p.nome).get(fest) + nbilhetes;
                        ticketsPair.put(fest, n);
                        winners.put(p.nome, ticketsPair);
                    }
                }
            }
            *//*if(winners.containsValue(p.nome)) {
                if(winners.get(p.nome).get(fest) <= 1 && nbilhetes <= 1){
                    HashMap<String, Integer> ticketsPair = new HashMap<>();
                    int n = winners.get(p).get(fest) + nbilhetes;
                    ticketsPair.put(fest, n);
                    winners.put(p.nome, ticketsPair);
                    int maxbilhetes = bilhetes.get(fest);
                    int restbilhetes = maxbilhetes - nbilhetes;
                    bilhetes.put(fest, restbilhetes);
                }
            }
            else{
                HashMap<String, Integer> ticketsPair = new HashMap<>();
                ticketsPair.put(fest, nbilhetes);
                winners.put(p.nome, ticketsPair);
                int maxbilhetes = bilhetes.get(fest);
                int restbilhetes = maxbilhetes - nbilhetes;
                bilhetes.put(fest, restbilhetes);
            }*//*
        }*/



        return winners;
    }

    public void listPessoas(){
        System.out.println("---------------------------------------------------------");
        System.out.println("WINNERS:");
        System.out.println("_________________________________________________________");
        for (String s : winners.keySet())
            System.out.println("[ ] "+ s);
        for (String p: contest.keySet()) {
            System.out.println("[x] "+ p);
        }
        System.out.println("---------------------------------------------------------\n");
    }

    public void listAvailableTickets(){
        for (String p: bilhetes.keySet())
            System.out.printf("%-23s : %-3s tickets available\n", p, bilhetes.get(p));
    }


}
