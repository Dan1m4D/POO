package MinitesteTP06.MT;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class RandomTicketTester {
    public static void main(String[] args) throws FileNotFoundException {

        RandomTickets tickets = new RandomTickets();

        List<Pessoa> r = new ArrayList<>();
        r.add(new Pessoa("Maria", 34317245, new DateND(12, 1, 2000)));
        r.add(new Pessoa("Carlos", 36331424, new DateND(1, 10, 2003)));
        r.add(new Pessoa("Marta", 35940012, new DateND(31, 3, 2002)));
        r.add(new Pessoa("Sofia", 34765901, new DateND(14, 7, 2000)));
        r.add(new Pessoa("Tiago", 35006531, new DateND(3, 6, 2001)));

        System.out.println(tickets.bilhetes);

        // selecionar aleatoriamente uma pessoa, que receberá 1 ou 2 bilhetes para um dos festivais (escolhido aleatoriamente)
        // os bilhetes disponíveis estão listatos no ficheiro 'Lista_bilhetes.txt'
        for (int i=0; i<2*r.size(); i++) {
            int ri = (int) (Math.random()*r.size());
            System.out.println(tickets.getRandomTicket(r.get(ri)));
        }

        tickets.listPessoas();
        tickets.listAvailableTickets();
    }
}
