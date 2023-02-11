import java.util.ArrayList;
import java.util.List;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/one-week-preparation-kit-tower-breakers-1">hackerrank</a>
 */
public class TowerBreakersOne {
  public static void main(String[] args) {
    System.out.println(towerBreakers(100000,1));
    System.out.println(towerBreakers(61092, 2596));
    System.out.println(towerBreakers(276941, 868497));
    System.out.println(towerBreakers(3,7));
  }

  /**
   *
   * @param n number of towers.
   * @param m initial height of a tower.
   * @return who wins (1 if Player1, 2 if Player2).
   */
  public static int towerBreakers(int n, int m) {
    if (m == 1) return 2;
    return ((n % 2) == 1) ? 1 : 2;
  }

  public static List<Integer> primeFactors(int n)
  {
    List<Integer> factors = new ArrayList<>();
    // Print the number of 2s that divide n
    while (n % 2 == 0) {
      factors.add(2);
      n /= 2;
    }

    // n must be odd at this point.  So we can
    // skip one element (Note i = i +2)
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
      // While i divides n, print i and divide n
      while (n % i == 0) {
        factors.add(i);
        n /= i;
      }
    }

    // This condition is to handle the case when
    // n is a prime number greater than 2
    if (n > 2)
      factors.add(n);

    return factors;
  }
}
