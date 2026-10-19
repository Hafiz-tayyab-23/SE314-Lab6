
public class FinancialCalc_updated {

    public static double computeFinalValue(
            double principal,
            double interestRate,
            double years) {

        return principal * Math.pow(1 + interestRate, years);
    }

    public static void main(String[] args) {

        double principal = 500.0;
        double interestRate = 0.05;
        double years = 4;

        double finalValue = computeFinalValue(
                principal, interestRate, years);

        System.out.printf("Final Value: $%.2f%n", finalValue);
    }
}
