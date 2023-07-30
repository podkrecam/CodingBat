package String3;

public class MirrorEnds {
    /*
    Given a string, look for a mirror image (backwards) string at both the beginning and
    end of the given string. In other words, zero or more characters at the very begining
    of the given string, and at the very end of the string in reverse order (possibly overlapping).
    For example, the string "abXYZba" has the mirror end "ab".

    mirrorEnds("abXYZba") → "ab"
    mirrorEnds("abca") → "a"
    mirrorEnds("aba") → "aba"
     */
    private String string;

    public MirrorEnds(String string) {
        this.string = string;
        System.out.println("MirrorEnds: " + create());
    }

    private String create() {
        int end = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                end = i;
                break;
            } else {
                end = i + 1;
            }
        }

        return string.substring(0, end);
    }
}
