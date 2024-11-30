public class NumWords {

    public static void main(String[] args) {

        String number = args[0];

        int num_int = Integer.parseInt(number);

        int unite = num_int % 10;

        num_int = num_int / 10;

        int tens = num_int % 10;

        int hundreds = num_int / 10;

        System.out.println( hundreds + " hundreds, " + tens + " tens, and " + unite + " ones.");

    }
}

