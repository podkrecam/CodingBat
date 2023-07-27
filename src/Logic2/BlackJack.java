package Logic2;

public class BlackJack {
    /*
    Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

    blackjack(19, 21) → 21
    blackjack(21, 19) → 21
    blackjack(19, 22) → 19
     */
    private int a;
    private int b;

    public BlackJack(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("BlackJack: " + near21());
    }

    private int near21() {
        if (a < 22 || b < 22) {
            if (a > 21) {
                return b;
            }
            if (b > 21) {
                return a;
            }
            return Math.max(a, b);
        }

        return 0;
    }
}
