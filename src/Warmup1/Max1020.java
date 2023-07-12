package Warmup1;

public class Max1020 {
    private int a;
    private int b;

    public Max1020(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Max1020: " + check());
    }

    private int check() {

        if (a >= 10 && a <= 20 && b >= 10 && b <= 20) {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        } else if (a >= 10 && a <= 20) {
            return a;
        } else if (b >= 10 && b <= 20) {
            return b;
        }
        return 0;
    }
}
