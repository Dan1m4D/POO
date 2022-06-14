package MinitesteTP06.RandomTicketTester;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
public class RandomTickets {
    public HashMap<String, Integer> bilhetes = new HashMap<>();

    Scanner sc = new Scanner(new FileReader("MinitesteTP06/RandomTicketTester/Lista_festivais.txt"));
    while (sc.hasNextLine()) {
        String [] str = sc.nextLine().split("\\t");
        bilhetes.put(str[2], Integer.parseInt(str[4]));
    }
    public RandomTickets() throws FileNotFoundException {}

    public void getRandomTicket(Pessoa p){

    }
}
