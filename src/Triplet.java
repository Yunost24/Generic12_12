public class Triplet<A> {
    private final A first;
    private final A second;
    private final A third;

    public Triplet(A first, A second, A third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public boolean contains(A element) {
        return first.equals(element) || second.equals(element) || third.equals(element);
    }

    public A min() {
        if (!(first instanceof Comparable)) throw new IllegalStateException("Элементы не Comparable.");
        A min = first;
        if (((Comparable<A>) second).compareTo(min) < 0) min = second;
        if (((Comparable<A>) third).compareTo(min) < 0) min = third;
        return min;
    }

    public Object sum() {
        if (first instanceof Number && second instanceof Number && third instanceof Number) {
            return ((Number) first).doubleValue() + ((Number) second).doubleValue() + ((Number) third).doubleValue();
        } else {
            return first.toString() + " " + second.toString() + " " + third.toString();
        }
    }

    @Override
    public String toString() {
        return "Triplet(" + first + ", " + second + ", " + third + ")";
    }

    public static void main(String[] args) {
        Triplet<Integer> triplet = new Triplet<>(1, 2, 3);
        System.out.println("Содержит 2? " + triplet.contains(2));
        System.out.println("Минимум: " + triplet.min());
        System.out.println("Сумма: " + triplet.sum());

        Triplet<String> stringTriplet = new Triplet<>("A", "B", "C");
        System.out.println("Сумма: " + stringTriplet.sum());
    }
}
