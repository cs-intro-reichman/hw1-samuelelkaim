public class Bill3 {

    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Error: Expected 4 arguments (3 names and a bill amount)");
            return;
        }

        // Extract names and bill amount
        String[] names = {args[0], args[1], args[2]};
        double billAmount = Double.parseDouble(args[3]);

        // Sort names in reverse alphabetical order
        sortNamesReverse(names);

        // Calculate the amount each person pays, rounded to one decimal place
        double amountPerPerson = Math.ceil((billAmount / 3) * 10) / 10;

        // Print the output
        System.out.printf(
            "Dear %s, %s, and %s: pay %.1f Shekels each.%n",
            names[0], names[1], names[2], amountPerPerson
        );
    }

    private static void sortNamesReverse(String[] names) {
        // Simple bubble sort for reverse alphabetical order
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) < 0) {
                    // Swap names[i] and names[j]
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
    }
}
