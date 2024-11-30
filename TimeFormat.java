public class TimeFormat {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Error: Expected 1 argument (time in 24-hour format)");
            return;
        }

        String time = args[0];
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        String period; // AM or PM
        String formattedTime;

        if (hour == 0) {
            // Special case for midnight
            period = "AM";
            formattedTime = String.format("0:%02d %s", minute, period);
        } else if (hour < 12) {
            // Morning hours (1 to 11 AM)
            period = "AM";
            formattedTime = String.format("%d:%02d %s", hour, minute, period);
        } else if (hour == 12) {
            // Noon
            period = "PM";
            formattedTime = String.format("%d:%02d %s", hour, minute, period);
        } else {
            // Afternoon and evening hours (1 to 11 PM)
            period = "PM";
            formattedTime = String.format("%d:%02d %s", hour - 12, minute, period);
        }

        System.out.println(formattedTime);
    }
}
