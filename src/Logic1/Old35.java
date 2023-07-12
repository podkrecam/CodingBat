package Logic1;

public class Old35 {
    private int n;

    public Old35(int n) {
        this.n = n;
        System.out.println("Old35: " + check());
    }

    private boolean check() {
        if (n % 15 == 0) {
            return false;
        } else {
            return n % 3 == 0 || n % 5 == 0;
        }
    }
}
