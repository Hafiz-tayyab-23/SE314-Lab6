
public class FinancialCalc {

    public static void main(String[] args) {

        double principal = 500.0;
        double interestRate = 0.05;
        double years = 4;

        double finalValue = principal *
                Math.pow(1 + interestRate, years);

        System.out.printf("Final Value: $%.2f%n", finalValue);
    }
}
