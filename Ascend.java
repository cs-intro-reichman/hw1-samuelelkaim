public class Ascend {
    public static void main(String[] args) {
        int limit = Integer.parseInt(args[0]);

        int a = (int) (Math.random() * limit);
        int b = (int) (Math.random() * limit);
        int c = (int) (Math.random() * limit);

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int middle = a + b + c - min - max;

        System.out.println(a + " " + b + " " + c);
        System.out.println(min + " " + middle + " " + max)  ;
    }
}


