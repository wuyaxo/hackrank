package edu.elac.hackrank;

/**
 * <p>
 *
 * @description: </p>
 * @author: David
 * @create: 2024-02-05 09:41
 */
public class HourFormat {

    public static void main(String[] args) {
        System.out.println(timeConversion("12:45:54PM"));
    }

    public static String timeConversion(String s) {
        // Write your code here
        int hour = Integer.parseInt(s.substring(0, 2));
        String period = s.substring(8, 10);
        if (hour < 12 && period.equals("PM")) {
            hour += 12;
        }
        if (hour >= 12 && period.equals("AM")) {
            hour = 0;
        }

        if (hour > 23) {
            hour = 0;
        }
        return String.format("%02d", hour) + s.substring(2, 8);
    }

}