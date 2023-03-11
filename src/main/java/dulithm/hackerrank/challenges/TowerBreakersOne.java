package dulithm.hackerrank.challenges;

/**
 * @author Dulith
 * @see <a href="https://www.hackerrank.com/challenges/one-week-preparation-kit-tower-breakers-1">hackerrank</a>
 */
public class TowerBreakersOne {
    /**
     * Two players are playing a game of Tower Breakers!<br/>
     * Player 1 always moves first, and both players always play optimally.The rules of the game are as follows: <ul>
     * <li>Initially there are <code>n</code> towers.</li>
     * <li>Each tower is of height <code>m</code>.</li>
     * <li>The players move in alternating turns.</li>
     * <li>In each turn, a player can choose a tower of height <code>x</code> and reduce its height to <code>y</code>,
     * where: <pre>1 <= y < x</pre> and <code>y</code> evenly divides <code>x</code>.</li>
     * <li>If the current player is unable to make a move, they lose the game.</li></ul><br/>
     * <p>
     * we can simplify this problem: <ul>
     * <li>If tower heights are equal to 1 initially, Player 1 cannot move, thus Player 2 wins</li>
     * <li>For any other tower height, if the number of towers are odd Player 1 will always win,
     * otherwise Player 2 wins</li>
     * </ul>
     *
     * @param n number of towers.
     * @param m initial height of a tower.
     * @return who wins (1 if Player1, 2 if Player2).
     */
    public int towerBreakers(int n, int m) {
        if (m == 1) return 2;
        return ((n % 2) == 1) ? 1 : 2;
    }
}
