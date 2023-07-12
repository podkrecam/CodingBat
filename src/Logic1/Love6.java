package Logic1;

public class Love6 {
    private int a;
    private int b;

    public Love6(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Love6: " + check());
    }

    private boolean check() {
        return a == 6 || b == 6 || Math.abs(a - b) == 6 || a + b == 6;
    }
}
