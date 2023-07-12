package String2;

public class XyzThere {
    private String str;

    public XyzThere(String str) {
        this.str = str;
        System.out.println("XyzThere: " + check());
    }

    private boolean check() {
        int counter = 0;
        if (str.startsWith("xyz")) {
            counter++;
        } else {
            for (int i = 1; i < str.length() - 2; i++) {
                if (str.startsWith("xyz", i) && str.charAt(i - 1) != '.') {
                    counter++;
                }
            }
        }
        return counter > 0;
    }
}
