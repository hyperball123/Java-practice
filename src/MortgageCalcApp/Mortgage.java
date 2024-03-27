package MortgageCalcApp;

public class Mortgage {
    private final int principal;
    private final float annualInterest;
    private final byte years;

    public Mortgage(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateMortgage() {
        float monthlyInterest = annualInterest / 12 / 100;
        float numberOfPayments = years * 12;

        return principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public double[] calculatePaymentSchedule() {
        double[] schedule = new double[years * 12];
        for (int month = 0; month < schedule.length; month++) {
            schedule[month] = calculateBalance(month + 1);
        }
        return schedule;
    }

    private double calculateBalance(int numberOfPaymentsMade) {
        float monthlyInterest = annualInterest / 12 / 100;
        float numberOfPayments = years * 12;

        return principal * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }
}
