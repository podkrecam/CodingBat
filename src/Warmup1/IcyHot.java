package Warmup1;

public class IcyHot {
    private int temp1;
    private int temp2;

    public IcyHot(int temp1, int temp2) {
        this.temp1 = temp1;
        this.temp2 = temp2;
        System.out.println(check());
    }

    private boolean check() {
        return (temp1 > 100 && temp2 < 0) || (temp1 < 0 && temp2 > 100);
    }
}
