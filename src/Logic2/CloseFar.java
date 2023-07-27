package Logic2;

public class CloseFar {
    /*
    Given three ints, a b c, return true if one of b or c is "close"
    (differing from a by at most 1), while the other is "far", differing
    from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.

    closeFar(1, 2, 10) → true
    closeFar(1, 2, 3) → false
    closeFar(4, 1, 3) → true
     */
    private int a;
    private int b;
    private int c;

    public CloseFar(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("CloseFar: " + check());
    }

    private boolean check() {
        return (Math.abs(a - b) < 2 && Math.abs(a - c) > 1 && Math.abs(b - c) > 1) || (Math.abs(a - c) < 2 && Math.abs(a - b) > 1 && Math.abs(b - c) > 1);
    }
}
