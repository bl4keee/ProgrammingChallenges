package DataTypes;

import java.util.Scanner;

public class FutureInvestment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the investment amount: ");
        double investment = scanner.nextDouble();
        System.out.println("Enter the interest rate: ");
        double rate = scanner.nextDouble();
        System.out.println("Enter the number of years: ");
        int year = scanner.nextInt();

        rate = rate * 0.01;

        System.out.println("Years       Future Value");
        for (int i = 1; i <= year; i++) {
            int formatter = 19;
            if (i >= 10) formatter = 18;
            System.out.printf(i + "%" + formatter + ".2f\n", futureInvestmentValue(investment, rate/12, i));
        }
    }

    private static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
