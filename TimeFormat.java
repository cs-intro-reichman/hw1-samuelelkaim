public class TimeFormat {
    public static void main(String[] args) {
        String[] timeParts = args[0].split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);

        String period = (hours < 12) ? "AM" : "PM";
        hours = (hours == 0 || hours == 12) ? 12 : hours % 12;

        System.out.printf("%d:%02d %s%n", hours, minutes, period);
    }
}

    

