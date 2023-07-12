package Logic1;

public class InOrderEqual {
    private int a;
    private int b;
    private int c;
    boolean equalOk;

    public InOrderEqual(int a, int b, int c, boolean equalOk) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.equalOk = equalOk;
        System.out.println("InOrderEqual: " + check());
    }

    private boolean check() {
        return !equalOk && a < b && b < c || equalOk && a <= b && b <= c;
    }
}
