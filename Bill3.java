
public class Bill3 {

    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Error: Expected 4 arguments (3 names and a bill amount)");
            return;
        }

        // Extract names and bill amount from input
        String[] names = {args[0], args[1], args[2]};
        double billAmount = Double.parseDouble(args[3]);

        // Sort names in reverse alphabetical order
        Arrays.sort(names, Collections.reverseOrder());

        // Calculate the amount each person pays
        double amountPerPerson = billAmount / 3;

        // Print the result
        System.out.printf("Dear %s, %s, and %s: pay %.1f Shekels each.%n", names[0], names[1], names[2], amountPerPerson);
    }
}
