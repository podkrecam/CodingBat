package String2;

public class PrefixAgain {
    private String str;
    private int n;

    public PrefixAgain(String str, int n) {
        this.str = str;
        this.n = n;
        System.out.println("PrefixAgain: " + check());
    }

    private boolean check() {
        boolean hasPrefix = false;
        for (int i = n; i <= str.length() - n; i++) {
            if (str.substring(0, n).equals(str.substring(i, i + n))) {
                hasPrefix = true;
                break;
            }
        }
        return hasPrefix;
    }
}
