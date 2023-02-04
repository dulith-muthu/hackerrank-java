/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/append-and-delete/problem">hackerrank</a>
 */
public class AppendAndDelete {
    public static void main(String[] args) {
        System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9));
        System.out.println(appendAndDelete("aba", "aba", 7));
        System.out.println(appendAndDelete("ashley", "ash", 2));
        System.out.println(appendAndDelete("a", "aca", 2));
        System.out.println(appendAndDelete("aca", "a", 2));
        System.out.println(appendAndDelete("aaabbb", "cccddd", 11));
        System.out.println(appendAndDelete("", "hello", 4));
        System.out.println(appendAndDelete("hellooooooooooooooooo", "hello", 16));
        System.out.println(appendAndDelete("hello", "hellooooooooooooooooo", 16));
        System.out.println(appendAndDelete("hello", "hellobro", 10));
    }

    /**
     * @param s the initial string.
     * @param t the desired string.
     * @param k the exact number of operations that must be performed.
     * @return 'Yes' if number of steps are sufficient for the conversion, else 'No'.
     */
    public static String appendAndDelete(String s, String t, int k) {
        String subT = t;
        int steps = t.length() < s.length() ? (s.length() - t.length()) : 0;
        while (subT.length() > 0 && !s.startsWith(subT)) {
            steps += s.length() < subT.length() ? 1 : 2;
            subT = subT.substring(0, subT.length() - 1);
        }
        if (steps > k) return "No";
        if (steps == k) return "Yes";
        int remaining = k - steps;
        // if more steps remaining than the minimum amount of steps needed
        // either the remaining number should be an even number (to perform both deletion and addition)
        // or the remaining number should be greater than twice the length of the matching substring
        // where we can perform single step deletions for empty strings
        return (remaining) % 2 == 0 || remaining > (subT.length() * 2) ? "Yes" : "No";
    }
}
