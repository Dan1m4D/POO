package Aula_10;
import java.util.HashMap;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        HashMap<String, String> dict = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int i = 0, o;
        String key, value;

        do{
            System.out.println("""
                    Menu
                    ==================
                    1: Create dictionary
                    2: Add a pair to the dictionary
                    3: Remove pair from dictionary
                    4: Print dictionary
                    0: Exit
                    """);
            System.out.print("Option: ");
            o = sc.nextInt();
            sc.nextLine();
            switch (o){
                case 0:
                    break;
                case 1:
                    System.out.println("Insert the term and its meaning. Press enter twice after you insert the term.");
                    do{
                        System.out.println("Term?");
                        key = sc.nextLine();
                        System.out.println("Meaning?");
                        value = sc.nextLine();
                        dict.put(key, value);
                        i ++;

                    }
                    while (i < 5);
                    System.out.println("Dictionary created successfully!");
                    break;
                case 2:
                    System.out.println("Term?");
                    key = sc.nextLine();
                    System.out.println("Meaning?");
                    value = sc.nextLine();
                    dict.put(key, value);
                    break;
                case 3:
                    System.out.println("Term?");
                    key = sc.nextLine();
                    dict.remove(key);
                    break;
                case 4:
                    System.out.println(toString(dict));
                    break;
                default:
                    System.out.println("No such option!");
                    break;
            }
        }while (o != 0);
    }

    public static String toString(HashMap<String, String> d){
        StringBuilder msg = new StringBuilder("<<< " + d.getClass().getSimpleName() + " >>>\n=================================================\n");
        StringBuilder terms = new StringBuilder("<< TERMS >>\n==================\n");
        StringBuilder mean = new StringBuilder("<< MEANINGS >>\n======================\n");
        for (String key : d.keySet()){
            msg.append(String.format("%s    :   %s\n", key, d.get(key)));
            terms.append(key).append("\n");
            mean.append(d.get(key)).append("\n");
        }
        msg.append(terms);
        msg.append(mean);
        return msg.toString();
    }
}