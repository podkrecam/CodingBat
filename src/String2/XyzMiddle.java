package String2;

public class XyzMiddle {
    private String str;

    public XyzMiddle(String str) {
        this.str = str;
        System.out.println("XyzMiddle: " + check());
    }

    private boolean check() {
        boolean hasXyz = false;
        int start = 0;

        if (str.length() % 2 == 0) {
            start = (str.length() / 2) - 2;
        }

        if (str.length() % 2 != 0) {
            start = (str.length() / 2) - 1;
        }

        for (int i = start; i < str.length() / 2; i++) {
            if (str.startsWith("xyz", i)) {
                hasXyz = true;
            }
        }
        return hasXyz;
    }
}
