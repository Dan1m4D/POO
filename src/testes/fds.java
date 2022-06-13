package testes;
import java.util.*;

public class fds {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer> (); 
        int n =20;
        
        for (int i = 0; i < n; i++){
            list.add (i);
        }
        System.out.println(list);
        System.out.println(list.get(4));
    }
    
}
