package Logic1;

public class More20 {
    private int n;

    public More20(int n) {
        this.n = n;
        System.out.println("More20: " + check());
    }

    private boolean check() {
        return n % 20 == 1 || n % 20 == 2;
    }
}
