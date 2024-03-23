package Abstraction;

public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5,3);
        System.out.println("Area of rectangle: " + rect.area());

        Shape circle = new Circle(4);
        System.out.println("Area of circle: " + circle.area());
    }
}
