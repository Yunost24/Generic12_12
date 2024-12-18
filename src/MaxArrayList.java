import java.util.ArrayList;

public class MaxArrayList {
    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        if (list.isEmpty()) throw new IllegalArgumentException("Список пуст.");
        E max = list.get(0);
        for (E element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);

        System.out.println("Наибольший элемент: " + max(list));
    }
}
