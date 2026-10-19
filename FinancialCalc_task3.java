
public class FinancialCalc_task3 {

    // Task 2: Calculate final value
    public static double computeFinalValue(
            double principal, double interestRate, double years) {

        return principal * Math.pow(1 + interestRate, years);
    }

    // Task 3.1: Calculate principal
    public static double computePrincipal(
            double finalValue, double interestRate, double years) {

        return finalValue / Math.pow(1 + interestRate, years);
    }

    // Task 3.2: Calculate interest rate
    public static double computeInterestRate(
            double principal, double finalValue, double years) {

        return Math.pow(finalValue / principal, 1.0 / years) - 1;
    }

    // Task 3.3: Calculate number of years
    public static double computeYears(
            double principal, double finalValue, double interestRate) {

        return Math.log(finalValue / principal)
                / Math.log(1 + interestRate);
    }

    public static void main(String[] args) {

        // Task 2
        double finalValue = computeFinalValue(500.0, 0.05, 4);
        System.out.printf("Final Value: $%.2f%n", finalValue);

        // Task 3.1
        double principal = computePrincipal(1000.0, 0.05, 4);
        System.out.printf("Required Principal: $%.2f%n", principal);

        // Task 3.2
        double interestRate = computeInterestRate(500.0, 525.0, 3);
        System.out.printf("Required Interest Rate: %.2f%%%n",
                interestRate * 100);

        // Task 3.3
        double years = computeYears(100.0, 150.0, 0.044);
        System.out.printf("Required Years: %.2f%n", years);
    }
}

