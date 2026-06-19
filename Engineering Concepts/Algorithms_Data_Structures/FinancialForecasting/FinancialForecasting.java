public class FinancialForecasting {

    public static double predictFutureValue(double currentValue,
                                            double growthRate,
                                            int years) {

        if (years == 0) {
            return currentValue;
        }

        return predictFutureValue(
                currentValue * (1 + growthRate),
                growthRate,
                years - 1
        );
    }

    public static double predictFutureValueIterative(double currentValue,
                                                     double growthRate,
                                                     int years) {

        for (int i = 0; i < years; i++) {
            currentValue *= (1 + growthRate);
        }

        return currentValue;
    }

    public static double predictFutureValueFormula(double currentValue,
                                                   double growthRate,
                                                   int years) {

        return currentValue * Math.pow(1 + growthRate, years);
    }

    public static void main(String[] args) {

        double presentValue = 10000;
        double growthRate = 0.10;
        int years = 5;

        double recursiveResult =
                predictFutureValue(presentValue, growthRate, years);

        double iterativeResult =
                predictFutureValueIterative(presentValue, growthRate, years);

        double formulaResult =
                predictFutureValueFormula(presentValue, growthRate, years);

        System.out.println("Present Value: " + presentValue);
        System.out.println("Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Years: " + years);

        System.out.printf("\nRecursive Forecast: %.2f%n",
                recursiveResult);

        System.out.printf("Iterative Forecast: %.2f%n",
                iterativeResult);

        System.out.printf("Formula Forecast: %.2f%n",
                formulaResult);
    }
}