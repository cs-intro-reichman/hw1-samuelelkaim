public class FVCalc {

    public static void main(String[] args) {

        String currentValue = args[0];
        String rate = args[1];
        String year = args[2];

        double curval = Double.parseDouble(currentValue);
        double rate_double = Double.parseDouble(rate);
        int year_int = Integer.parseInt(year);

        double future_rate = (1 + (rate_double / 100));

        double result = Math.pow(future_rate, year_int);

        double future_val = curval * result;

        System.out.println(
                "After 2 years, $" + (int) curval + " saved at " + rate_double + "% will yield $" + (int) future_val);

    }

}
