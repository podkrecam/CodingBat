package String2;

public class XyBalance {
    private String str;
    private int counter;

    public XyBalance(String str) {
        this.str = str;
        System.out.println("XyBalance: " + check() + ", loopCounter = " + counter);
//        System.out.println("XyBalance: " + check1() + ", loopCounter = " + counter);
//        System.out.println("XyBalance: " + check2() + ", loopCounter = " + counter);
    }

    private boolean check() {
        counter = 0;
        boolean balance = true;
        for (int i = 0; i < str.length(); i++) {
            counter++;
            // check if str at index i has x, if has, set the flag to false and look for y
            if (str.charAt(i) == 'x') {
                balance = false;
                // look for y and if str at index j has y, set the i to j and set the flag to true
                for (int j = i + 1; j < str.length(); j++) {
                    counter++;
                    if (str.charAt(j) == 'y') {
                        i = j;
                        balance = true;
                    }
                }
            }
        }
        return balance;
    }

    private boolean check1() {
        counter = 0;
        // Find the rightmost y
        int y = -1;
        for (int i = 0; i < str.length(); i++) {
            counter++;
            if (str.charAt(i) == 'y') y = i;
        }

        // Look at the x's, return false if one is after y
        for (int i = 0; i < str.length(); i++) {
            counter++;
            if (str.charAt(i) == 'x' && i > y) return false;
        }
        return true;
    }

    private boolean check2() {
        counter = 0;
        boolean y = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            counter++;
            if (str.charAt(i) == 'y') y = true;

            if (str.charAt(i) == 'x' && !y) return false;
        }
        return true;
    }
}
