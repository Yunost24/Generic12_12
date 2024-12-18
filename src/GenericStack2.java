import java.util.ArrayList;

public class GenericStack2<E> extends ArrayList<E> {
    public E peek() {
        if (isEmpty()) throw new IllegalStateException("Стек пуст.");
        return get(size() - 1);
    }

    public void push(E o) {
        add(o);
    }

    public E pop() {
        if (isEmpty()) throw new IllegalStateException("Стек пуст.");
        return remove(size() - 1);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public String toString() {
        return "Стек: " + super.toString();
    }

    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Введите 5 строк:");
        for (int i = 0; i < 5; i++) {
            stack.push(scanner.nextLine());
        }

        System.out.println("Строки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}
