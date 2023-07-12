package Logic1;

public class WithoutDoubles {
    private int die1;
    private int die2;
    private boolean noDoubles;

    public WithoutDoubles(int die1, int die2, boolean noDoubles) {
        this.die1 = die1;
        this.die2 = die2;
        this.noDoubles = noDoubles;
        System.out.println("WithoutDoubles: " + sum());
    }

    private int sum() {
        int sum = 0;
        if (noDoubles && die1 == die2) {
            if (die1 == 6) {
                sum = die1 + 1;
            }
            sum = die1 + die2 + 1;
        } else {
            sum = die1 + die2;
        }
        return sum;
    }
}
