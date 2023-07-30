package String3;

public class SameEnds {
    /*
    Given a string, return the longest substring that appears at both the beginning
    and end of the string without overlapping. For example, sameEnds("abXab") is "ab".

    sameEnds("abXYab") → "ab"
    sameEnds("xx") → "x"
    sameEnds("xxx") → "x"
     */
    private String string;

    public SameEnds(String string) {
        this.string = string;
        System.out.println("SameEnds: " + create());
    }

    private String create() {
        int end = 0;

        for (int i = 0; i < (string.length() / 2); i++) {
            if (string.substring(0, i + 1).equals(string.substring(string.length() - i - 1))) {
                end = i + 1;
            }
        }

        return string.substring(0, end);
    }
}
