public class Bill3 {

    public static void main(String[] args) {
        String N1 = args[0];
        String N2 = args[1];
        String N3 = args[2];
        int bill = Integer.parseInt(args[3]);

        double pay = Math.ceil(bill / 3.0);

        System.out.println("Dear " + N1 + ", " + N2 + ", and " + N3 + ": pay " + pay + " Shekels each.");
    }
 }
