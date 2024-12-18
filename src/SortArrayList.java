import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(3);

        sort(list);
        System.out.println("Отсортированный список: " + list);
    }
}
