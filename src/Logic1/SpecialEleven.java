package Logic1;

public class SpecialEleven {
    private int n;

    public SpecialEleven(int n) {
        this.n = n;
        System.out.println("SpecialELeven: " + check());
    }

    private boolean check() {
        return n % 11 == 0 || n % 11 == 1;
    }
}
