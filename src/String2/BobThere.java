package String2;

public class BobThere {
    private String str;

    public BobThere(String str) {
        this.str = str;
        System.out.println("BobTHere: " + check());
    }

    private boolean check() {
        boolean hasBxb = false;
        if (str.length() > 2) {
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                    hasBxb = true;
                }
            }
        }
        return hasBxb;
    }
}
