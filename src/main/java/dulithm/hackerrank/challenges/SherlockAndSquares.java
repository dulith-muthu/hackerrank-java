package dulithm.hackerrank.challenges;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/sherlock-and-squares/problem">hackerrank</a>
 */
public class SherlockAndSquares {

    /**
     * provide a starting and ending value that describe a range of integers, inclusive of the endpoints.
     * must determine the number of square integers within that range.
     *
     * @param a start: <code>1 <= a <= 10<sup>9</sup></code>
     * @param b end: <code>1 <= b <= 10<sup>9</sup></code>
     * @return number of square integers within that range.
     */
    public int squares(int a, int b) {
        int start = this.getSqrtApproximation(a),
            end = this.getSqrtApproximation(b),
            count = end - start  + 1;
        if (start * start < a) {
            count --;
        }
        return count;
    }

    /**
     * Square root approximation using Digit-by-digit calculation in Binary numeral system (base 2)
     *
     * @param n number to approx sqrt
     * @return sqrt approximation
     * @see <a href="https://en.wikipedia.org/wiki/Methods_of_computing_square_roots#Binary_numeral_system_(base_2)">
     * wiki</a>
     */
    public int getSqrtApproximation(int n) {
        assert n > 0 : "sqrt input should be non-negative";
        // Xₙ₊₁
        int x = n;
        // cₙ
        int c = 0;
        //dₙ which starts at the highest power of four <= n
        int d = 1 << 30; // The second-to-top bit is set.
        //Same as ((unsigned) INT32_MAX + 1) / 2.
        while (d > n) {
            d >>= 2;
        }
        //for dₙ … d₀
        while (d != 0) {
            if (x >= c + d) { //if Xₘ₊₁ ≥ Yₘ then aₘ = 2ᵐ
                x -= c + d; //Xₘ = Xₘ₊₁ - Yₘ
                c = (c >> 1) + d; // cₘ₋₁ = cₘ/2 + dₘ (aₘ is 2ᵐ)
            } else {
                c >>= 1; // cₘ₋₁ = cₘ/2      (aₘ is 0)
            }
            d >>= 2; //dₘ₋₁ = dₘ/4
        }
        return c; // c₋₁
    }
}
