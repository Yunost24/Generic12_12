public class LargestIn2DArray {
    public static <E extends Comparable<E>> E findLargest(E[][] array) {
        E largest = array[0][0];
        for (E[] row : array) {
            for (E element : row) {
                if (element.compareTo(largest) > 0) {
                    largest = element;
                }
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Integer[][] array = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        System.out.println("Наибольший элемент: " + findLargest(array));
    }
}
