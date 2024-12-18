public class GenericStack<E> {
    private E[] array;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public GenericStack() {
        array = (E[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public E peek() {
        if (isEmpty()) throw new IllegalStateException("Стек пуст.");
        return array[size - 1];
    }

    public void push(E o) {
        if (size == array.length) {
            resizeArray();
        }
        array[size++] = o;
    }

    public E pop() {
        if (isEmpty()) throw new IllegalStateException("Стек пуст.");
        E o = array[--size];
        array[size] = null; // Удаление для GC
        return o;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Стек: [");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    @SuppressWarnings("unchecked")
    private void resizeArray() {
        E[] newArray = (E[]) new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }
}
