public class FVCalc {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Error: Expected 3 arguments (initial savings, interest rate, number of years)");
            return;
        }

        // Parse input arguments
        double savings = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]) / 100; // Convert percentage to decimal
        int years = Integer.parseInt(args[2]);

        // Calculate future value
        double futureValue = savings * Math.pow(1 + rate, years);

        // Round down the result to the nearest integer
        futureValue = Math.floor(futureValue);

        // Output the result
        System.out.printf("After %d years, a $%.0f saved at %.1f%% will yield $%.0f%n", years, savings, rate * 100, futureValue);
    }
}
