public class Bill3 {

    public static void main(String[] args) {
        // Assume inputs are exactly 4 arguments: 3 names and a bill amount
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        double billAmount = Double.parseDouble(args[3]);

        // Sort the names manually in reverse alphabetical order
        String temp1 = (name1.compareTo(name2) > 0) ? name1 : name2;
        String temp2 = (name1.compareTo(name2) > 0) ? name2 : name1;

        String sorted1 = (temp1.compareTo(name3) > 0) ? temp1 : name3;
        String sorted3 = (temp2.compareTo(name3) < 0) ? temp2 : name3;
        String sorted2 = (temp1.equals(sorted1)) ? temp2 : name3;

        // Calculate the payment per person (rounded to 1 decimal place)
        double amountPerPerson = Math.round((billAmount / 3) * 10.0) / 10.0;

        // Print the result
        System.out.printf("Dear %s, %s, and %s: pay %.1f Shekels each.%n", sorted1, sorted2, sorted3, amountPerPerson);
    }
}

      
