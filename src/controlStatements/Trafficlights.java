package controlStatements;

import java.util.Scanner;

public class Trafficlights {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the color of the traffic light (red, yellow, green):");
        String color = scn.nextLine();

        switch (color){
            case "red":
                System.out.println("Stop! The light is red.");
                break;
            case "yellow":
                System.out.println("Prepare to stop! The light is yellow.");
                break;
            case "green":
                System.out.println("Go! The light is green.");
                break;
            default:
                System.out.println("Invalid color entered");
        }
    }
}
