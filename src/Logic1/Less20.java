package Logic1;

public class Less20 {
    private int n;

    public Less20(int n) {
        this.n = n;
        System.out.println("Less20: " + check());
    }

    private boolean check() {
        return 20 - (n % 20) < 3;
    }
}
