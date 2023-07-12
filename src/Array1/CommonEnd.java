package Array1;

public class CommonEnd {
    private int[] a;
    private int[] b;

    public CommonEnd(int[] a, int[] b) {
        this.a = a;
        this.b = b;
        System.out.println(check());
    }

    private boolean check() {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }
}
