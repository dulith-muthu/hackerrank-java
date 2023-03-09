package dulithm.hackerrank.challenges;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/one-week-preparation-kit-time-conversion/problem">hackerrank</a>
 */
public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("12:05:45AM"));
        System.out.println(timeConversion("12:05:45PM"));
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("07:05:45AM"));
    }

    /**
     * convert 12-hour time to 24-hour time format.
     *
     * @param s time in  12-hour AM/PM format.
     * @return time in military (24-hour) time.
     */
    public static String timeConversion(String s) {
        final String AM = "AM", SPLITTER = ":";
        String meridiem = s.substring(s.length() - 2);
        String[] time = s.substring(0, s.length() - 2).split(SPLITTER);
        if (meridiem.equals(AM)) {
            if (time[0].equals("12")) time[0] = "00";
        } else {
            if (!time[0].equals("12")) time[0] = String.valueOf(Integer.parseInt(time[0]) + 12);
        }
        return String.join(SPLITTER, time);
    }
}
