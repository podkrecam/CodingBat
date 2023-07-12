package Warmup1;

public class MonkeyTrouble {
    private boolean aSmile;
    private boolean bSmile;

    public MonkeyTrouble(boolean aSmile, boolean bSmile) {
        this.aSmile = aSmile;
        this.bSmile = bSmile;
        if (trouble()) {
            System.out.println("We are in trouble!");
        } else {
            System.out.println("We are not in trouble, uff!");
        }
    }

    private boolean trouble() {
        return ((aSmile && bSmile) || (!aSmile && !bSmile));
    }
}
