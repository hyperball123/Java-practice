package MortgageCalcApp;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatorApp {
    private final Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("Welcome to the Mortgage Calculator!");
        Mortgage mortgage = getUserInput();
        printMortgage(mortgage);
        printPaymentSchedule(mortgage);
    }

    private Mortgage getUserInput() {
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();

        return new Mortgage(principal, annualInterest, years);
    }

    private void printMortgage(Mortgage mortgage) {
        double mortgageAmount = mortgage.calculateMortgage();
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgageAmount);
        System.out.println("\nMORTGAGE\n--------\nMonthly Payments: " + formattedMortgage);
    }

    private void printPaymentSchedule(Mortgage mortgage) {
        System.out.println("\nPAYMENT SCHEDULE\n----------------");
        for (double balance : mortgage.calculatePaymentSchedule()) {
            String formattedBalance = NumberFormat.getCurrencyInstance().format(balance);
            System.out.println(formattedBalance);
        }
    }
}
