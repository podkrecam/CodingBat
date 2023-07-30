package String3;

public class EqualIsNot {
    /*
    Given a string, return true if the number of appearances of "is" anywhere in the string
    is equal to the number of appearances of "not" anywhere in the string (case sensitive).

    equalIsNot("This is not") → false
    equalIsNot("This is notnot") → true
    equalIsNot("noisxxnotyynotxisi") → true
     */
    private String str;

    public EqualIsNot(String str) {
        this.str = str;
        System.out.println("EqualIsNot: " + check());
    }

    private boolean check() {
        int countIs = 0;
        int countNot = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.startsWith("is", i)) {
                countIs++;
            }
            if (i < str.length() - 2 && str.startsWith("not", i)) {
                countNot++;
            }
        }
        return countIs == countNot;
    }
}
