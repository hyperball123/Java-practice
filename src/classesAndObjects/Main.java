package classesAndObjects;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.model =  "Toyota";
        car1.color = "Red";
        car1.speed = 0;

        car1.accelerate();
        car1.accelerate();

        System.out.println("classesAndObjects.Car 1 Speed: " + car1.speed);

        car2.honk();
    }
}
