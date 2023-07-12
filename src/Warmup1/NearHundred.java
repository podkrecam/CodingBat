package Warmup1;

public class NearHundred {
    private int a;

    public NearHundred(int a) {
        this.a = a;
        System.out.println(isNear());
    }

    private boolean isNear() {
        // Math.abs - wartość bezwzględna
        return ((Math.abs(100 - a) <= 10) || (Math.abs(200 - a) <= 10));
    }
}
