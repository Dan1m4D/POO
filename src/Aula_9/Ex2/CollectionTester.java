package Aula_9.Ex2;
import java.util.*;

public class CollectionTester {
    public static void main(String[] args) {
        Integer [] DIM = {500, 1000, 5000, 10000, 50000};
        Collection <Integer> col= new ArrayList<>();
        checkPerformance (col, DIM);
        Collection <Integer> adqueue= new ArrayDeque<>();
        checkPerformance (adqueue, DIM);
        Collection <Integer> tree= new TreeSet<>();
        checkPerformance (tree, DIM);
        Collection <Integer> hash = new HashSet<>();
        checkPerformance (hash, DIM);
        Collection <Integer> link= new LinkedList<>();
        checkPerformance (link, DIM);
    }
    private static void checkPerformance(Collection<Integer> col, Integer[] dim) {
        ArrayList<Double> data = new ArrayList<>();
        for(int DIM: dim){
            double start, stop, delta;
            // Add
            start = System.nanoTime(); // clock snapshot before
            for (int i = 0; i < DIM; i++)
                col.add(i);
            stop = System.nanoTime();  // clock snapshot after
            delta = (stop - start) / 1e6; // convert to milliseconds
            data.add(delta);
            // Search
            start = System.nanoTime(); // clock snapshot before
            for (int i = 0; i < DIM; i++) {
                int n = (int) (Math.random() * DIM);
                if (!col.contains(n))
                    System.out.println("Not found???" + n);
            }
            stop = System.nanoTime();  // clock snapshot after
            delta = (stop - start) / 1e6; // convert nanoseconds to milliseconds
            data.add(delta);
            // Remove
            start = System.nanoTime(); // clock snapshot before
            Iterator<Integer> iterator = col.iterator();

            while (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
            stop = System.nanoTime();  // clock snapshot after
            delta = (stop - start) / 1e6; // convert nanoseconds to milliseconds
            data.add(delta);
        }


        System.out.printf("""
                        %s (Runtime in ms)
                        ------------------------------------------------------------------------------------------
                        Add:          %8f           %8f          %8f          %8f          %8f
                        Search:       %8f           %8f          %8f          %8f          %8f
                        Remove:       %8f           %8f          %8f          %8f          %8f
                        ==========================================================================================
                        """, col.getClass().getSimpleName(), data.get(0), data.get(3), data.get(6), data.get(9), data.get(12),
                                                                                                                                                data.get(1), data.get(4), data.get(7), data.get(10), data.get(13),
                                                                                                                                                data.get(2), data.get(5), data.get(8), data.get(11), data.get(14));
    }
}
