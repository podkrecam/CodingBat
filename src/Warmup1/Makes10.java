package Warmup1;

public class Makes10 {
    private int a;
    private int b;

    public Makes10(int a, int b) {
        this.a = a;
        this.b = b;
        if (overTen()) {
            System.out.println("One of the numbers or sum of them equals 10!");
        } else {
            System.out.println("Both of the numbers and sum of them are different than 10!");
        }
    }

    private boolean overTen() {
        return (a == 10 || b == 10 || a + b == 10);
    }
}
