import java.util.Scanner;

public class TimeDifferenceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter a time range (e.g., '12:45am-12:43pm' or '1:30am-3:44pm'): ");
        String timeRange = "12:05am-12:43pm";//scanner.nextLine();

        String timeDifference = calculateTimeDifference(timeRange);
System.out.println();
        System.out.println("Time difference in minutes: " + timeDifference);

        scanner.close();
    }

    public static String calculateTimeDifference(String timeRange) {
        String[] times = timeRange.split("-");

        for(int i=0;i<2;i++)
            System.out.println(times[i]);

        String startTime = times[0];
        String endTime = times[1];

        int minutesStart = convertToMinutes(startTime);
        int minutesEnd = convertToMinutes(endTime);

        if (minutesEnd < minutesStart) {
            minutesEnd += 12 * 60; // Add 12 hours if it's in the afternoon
        }

        int difference = minutesEnd - minutesStart;

        return Integer.toString(difference);
    }

    public static int convertToMinutes(String time) {
        String[] parts = time.split(":");
        System.out.println();
        for(int i=0;i<2;i++)
            System.out.println(parts[i]);

        int hour = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1].substring(0, 2));
        System.out.println("minutes :"+minutes);
        String period = time.substring(time.length() - 2);

        if (period.equalsIgnoreCase("pm") && hour != 12) {
            hour += 12;
        } else if (period.equalsIgnoreCase("am") && hour == 12) {
            hour = 0;
        }

        return hour * 60 + minutes;
    }
}
