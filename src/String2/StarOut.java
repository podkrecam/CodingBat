package String2;

public class StarOut {
    /*
    Return a version of the given string, where for every star (*) in the string the star and the chars
    immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
     */
    private String str;

    public StarOut(String str) {
        this.str = str;
        System.out.println("StarOut: " + make());
    }

    private String make() {
        String temp = "";
        if (str.contains("*")) {
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) != '*' && str.charAt(i + 1) != '*') {
                    temp += str.charAt(i);
                }
                if (str.charAt(i) == '*' && str.charAt(i + 1) != '*') {
                    i++;
                }
            }
            if (str.charAt(str.length() - 1) != '*' && str.charAt(str.length() - 2) != '*') {
                temp += str.charAt(str.length() - 1);
            }
        } else {
            temp = str;
        }
        return temp;
    }
}
