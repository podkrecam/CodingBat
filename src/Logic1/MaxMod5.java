package Logic1;

public class MaxMod5 {
    private int a;
    private int b;

    public MaxMod5(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("MaxMod5: " + max());
    }

    private int max() {
        int max = a;
        if (a == b) {
            max = 0;
        } else if (a % 5 == b % 5) {
            max = Math.min(a, b);
        } else if (a < b) {
            max = b;
        }
        return max;
    }
}
