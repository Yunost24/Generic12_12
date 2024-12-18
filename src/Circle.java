public class Circle implements Comparable<Circle> {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public int compareTo(Circle o) {
        return Double.compare(this.radius, o.radius);
    }

    @Override
    public String toString() {
        return "Circle(radius=" + radius + ")";
    }

    public static Circle findLargest(Circle[] circles) {
        if (circles == null || circles.length == 0) return null;
        Circle largest = circles[0];
        for (Circle circle : circles) {
            if (circle.compareTo(largest) > 0) {
                largest = circle;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Circle[] circles = { new Circle(1.0), new Circle(3.0), new Circle(2.0) };
        System.out.println("Наибольший круг: " + findLargest(circles));
    }
}
