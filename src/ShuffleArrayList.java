import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static <E> void shuffle(ArrayList<E> list) {
        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) list.add(i);

        shuffle(list);
        System.out.println("Перемешанный список: " + list);
    }
}
