package Logic2;

public class EvenlySpaced {
    /*
    Given three ints, a b c, one of them is small, one is medium and one is large.
    Return true if the three values are evenly spaced, so the difference between
    small and medium is the same as the difference between medium and large.

    evenlySpaced(2, 4, 6) → true
    evenlySpaced(4, 6, 2) → true
    evenlySpaced(4, 6, 3) → false
     */

    private int a;
    private int b;
    private int c;

    public EvenlySpaced(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("EvenlySpaced: " + check1());
    }

    private boolean check1() {
        return (a + b + c) % 3 == 0 && (Math.abs(a - b) == Math.abs(b - c) || Math.abs(a - b) == Math.abs(a - c) || Math.abs(a - c) == Math.abs(b - c));
    }

    private boolean check2() {
        int min = min();
        int medium = medium();
        int max = max();

        return max - medium == medium - min;
    }

    private int min() {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    private int max() {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    private int medium() {
        int medium = a;
        if (b > min() && b < max()) {
            medium = b;
        }
        if (c > min() && c < max()) {
            medium = c;
        }
        return medium;
    }
}
