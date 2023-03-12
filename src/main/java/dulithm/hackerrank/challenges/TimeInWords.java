package dulithm.hackerrank.challenges;

public class TimeInWords {
    final String[] numbers = new String[]{
            "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"
    }, teens = new String[]{
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    /**
     * Given the time in numerals we may convert it into words, as shown below:<ul>
     * <li>5.00 -> five o' clock</li>
     * <li>5.01 -> one minute past five</li>
     * <li>5.15 -> quarter past five</li>
     * <li>5.15 -> half past five</li>
     * <li>5.40 -> twenty minutes to six</li>
     * <li>5.45 -> quarter to six</li>
     * </ul>
     *
     * @param h the hour of the day
     * @param m the minutes after the hour
     * @return time string as described
     */
    public String timeInWords(int h, int m) {
        if (m == 0) {
            return String.format("%s o' clock", numbers[h - 1]);
        }
        if (m == 15) {
            return String.format("quarter past %s", numbers[h - 1]);
        }
        if (m == 30) {
            return String.format("half past %s", numbers[h - 1]);
        }
        if (m == 45) {
            return String.format("quarter to %s", numbers[h % 12]);
        }
        if (m < 30) {
            if (m < 11) {
                return String.format("%s minute%s past %s", numbers[m - 1], m == 1 ? "" : "s", numbers[h - 1]);
            } else if (m < 20) {
                return String.format("%s minutes past %s", teens[m % 10 - 1], numbers[h - 1]);
            } else if (m == 20) {
                return String.format("twenty minutes past %s", numbers[h - 1]);
            } else {
                return String.format("twenty %s minutes past %s", numbers[m % 20 - 1], numbers[h - 1]);
            }
        } else {
            int mBar = 60 - m;
            if (mBar < 11) {
                return String.format("%s minute%s to %s", numbers[mBar - 1], mBar == 1 ? "" : "s", numbers[h % 12]);
            } else if (mBar < 20) {
                return String.format("%s minutes to %s", teens[mBar % 10 - 1], numbers[h % 12]);
            } else if (mBar == 20) {
                return String.format("twenty minutes to %s", numbers[h % 12]);
            } else {
                return String.format("twenty %s minutes to %s", numbers[mBar % 20 - 1], numbers[h % 12]);
            }
        }
    }
}
