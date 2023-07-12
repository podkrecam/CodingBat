package Logic1;

public class InOrder {
    private int a;
    private int b;
    private int c;
    private boolean bOk;

    public InOrder(int a, int b, int c, boolean bOk) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.bOk = bOk;
        System.out.println("InOrder: " + check());
    }

    private boolean check() {
        return !bOk && a < b && b < c || bOk && b < c;
    }
}
