package Logic1;

public class NearTen {
    private int num;

    public NearTen(int num) {
        this.num = num;
        System.out.println("NearTen: " + check());
    }

    private boolean check() {
        return (num % 10) < 3 || 10 - (num % 10) < 3;
    }
}
