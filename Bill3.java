public class Bill3 {

    public static void main(String[] args) {
        // Assume inputs: 3 names and a bill amount
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        double billAmount = Double.parseDouble(args[3]);

        // Sort names in reverse alphabetical order
        String temp;
        if (name1.compareTo(name2) < 0) {
            temp = name1;
            name1 = name2;
            name2 = temp;
        }
        if (name1.compareTo(name3) < 0) {
            temp = name1;
            name1 = name3;
            name3 = temp;
        }
        if (name2.compareTo(name3) < 0) {
            temp = name2;
            name2 = name3;
            name3 = temp;
        }

        // Calculate payment per person using exact rounding
        double exactPayment = billAmount / 3.0;
        double amountPerPerson = Math.round(exactPayment * 10) / 10.0;

        // Print the result in the correct format
        System.out.printf("Dear %s, %s, and %s: pay %.1f Shekels each.%n", name1, name2, name3, amountPerPerson);
    }
}

 
