public class LinearSearch {
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(linearSearch(array, 3)); // 2
        System.out.println(linearSearch(array, 6)); // -1
    }
}
