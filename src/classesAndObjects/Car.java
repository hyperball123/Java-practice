package classesAndObjects;

public class Car {
    String model;
    String color;
    int speed;

    public void accelerate(){
        speed += 10;
    }

    public void brake(){
        speed -= 10;
    }

    public void honk() {
        System.out.println("Beep beep!");
    }
}

