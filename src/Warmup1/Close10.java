package Warmup1;

public class Close10 {
    private int a, b;

    public Close10(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Close10: " + compare());
    }

    private int compare() {
        if (Math.abs(a - 10) < Math.abs(b - 10)) {
            return a;
        } else if (Math.abs(b - 10) < Math.abs(a - 10)) {
            return b;
        } else {
            return 0;
        }
    }
}
