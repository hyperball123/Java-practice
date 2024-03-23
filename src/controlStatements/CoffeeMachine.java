package controlStatements;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Welcome to the Coffee Machine!");
        System.out.println("Please select your coffee:");
        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        System.out.println("3. Cappuccino");
        System.out.println("Enter your choice:");

        int choice = scn.nextInt();

        switch (choice){
            case 1:
                prepareCoffee("Espresso",2.50);
                break;
            case 2:
                prepareCoffee("Latte",3.00);
                break;
            case 3:
                prepareCoffee("Cappuccino",3.50);
                break;
            default:
                System.out.println("Invalid choice. Please try again");
        }
    }

        public static void prepareCoffee(String type,double price){
            System.out.println("Preparing " + type + "...");
            System.out.println("Please insert $" + price + " to continue:");

            Scanner scn = new Scanner(System.in);
            double payment = scn.nextDouble();

            if(payment >= price){
                double change = payment - price;
                System.out.println("Coffee served! Enjoy your " + type + ".");
                if(change > 0) {
                    System.out.println("Change: $" + change);
                }
            } else {
                System.out.println("Insufficient payment. Please insert more money.");
            }
    }
}
//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
//