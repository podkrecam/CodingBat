package Logic2;

public class MakeBricks {
    /*
    We want to make a row of bricks that is goal inches long.
    We have a number of small bricks (1 inch each) and big bricks (5 inches each).
    Return true if it is possible to make the goal by choosing from the given bricks.
    This is a little harder than it looks and can be done without any loops.

    makeBricks(3, 1, 8) → true
    makeBricks(3, 1, 9) → false
    makeBricks(3, 2, 10) → true
     */
    private int small;
    private int big;
    private int goal;

    public MakeBricks(int small, int big, int goal) {
        this.small = small;
        this.big = big;
        this.goal = goal;
        System.out.println("MakeBricks: " + check());
    }

    private boolean check() {

        return small + big * 5 >= goal && goal % 5 <= small;
    }
}
