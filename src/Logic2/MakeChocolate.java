package Logic2;

public class MakeChocolate {
    /*
    We want make a package of goal kilos of chocolate. We have small bars (1 kilo each)
    and big bars (5 kilos each). Return the number of small bars to use, assuming
    we always use big bars before small bars. Return -1 if it can't be done.

    makeChocolate(4, 1, 9) → 4
    makeChocolate(4, 1, 10) → -1
    makeChocolate(4, 1, 7) → 2
     */
    private int small;
    private int big;
    private int goal;

    public MakeChocolate(int small, int big, int goal) {
        this.small = small;
        this.big = big;
        this.goal = goal;
        System.out.println("MakeChocolate: " + make());
    }

    private int make() {
        if ((small + big * 5) >= goal && goal % 5 <= small) {
            if (big * 5 > goal) {
                return goal % 5;
            } else {
                return goal - (big * 5);
            }
        } else {
            return -1;
        }
    }
}
