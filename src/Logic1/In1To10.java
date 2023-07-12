package Logic1;

public class In1To10 {
    private int n;
    private boolean outsideMode;

    public In1To10(int n, boolean outsideMode) {
        this.n = n;
        this.outsideMode = outsideMode;
        System.out.println("In1To10: " + check());
    }

    private boolean check() {
        if (outsideMode && (n < 2 || n > 9)) {
            return true;
        } else if (!outsideMode && (n > 0 && n < 11)) {
            return true;
        }
        return false;
    }
}
