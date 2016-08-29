import org.raj.sort.impl.InsertionSort;
import org.raj.sort.impl.SelectionSort;

public class Main {

    public static void main(String[] args) {
        int[] before = new int[]{4, 3, 5, 7, 1, 1, 1, 1, 3, 2};
        InsertionSort insertionSort = new InsertionSort();
        long startTime = System.nanoTime();
        int[] after = insertionSort.sort(before);
        long endTime = System.nanoTime();

        SelectionSort selectionSort = new SelectionSort();
        startTime = System.nanoTime();
        after = insertionSort.sort(before);
        endTime = System.nanoTime();

        System.out.print("[");
        for (int i = 0; i < after.length; i++) {
            System.out.print(after[i]);
            if (i != after.length - 1)
                System.out.print(",");
        }
        System.out.println("]");

        System.out.println("Time in nano seconds - " + (endTime - startTime));

    }
}
