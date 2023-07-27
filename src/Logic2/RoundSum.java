package Logic2;

public class RoundSum {
    /*
    For this problem, we'll round an int value up to the next multiple of 10
    if its rightmost digit is 5 or more, so 15 rounds up to 20.
    Alternately, round down to the previous multiple of 10 if its rightmost
    digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c,
    return the sum of their rounded values. To avoid code repetition, write a
    separate helper "public int round10(int num) {" and call it 3 times.
    Write the helper entirely below and at the same indent level as roundSum().

    roundSum(16, 17, 18) → 60
    roundSum(12, 13, 14) → 30
    roundSum(6, 4, 4) → 10
     */
    private int a;
    private int b;
    private int c;

    public RoundSum(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("RoundSum: " + sum());
    }

    private int sum() {

        return round10(a) + round10(b) + round10(c);
    }

    private int round10(int num) {
        if (num % 10 < 5) {
            return num - (num % 10);
        }
        return num + (10 - (num % 10));
    }
}
