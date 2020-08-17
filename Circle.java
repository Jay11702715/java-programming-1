public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    double getRadius() {
        return radius;
    }
    double getArea() {
        return ((22 * radius * radius)/7);
    }

    public static void main(String[] args) {
        Circle obj = new Circle();
        System.out.println(obj.getRadius());
        System.out.println(obj.getArea());
    }
}