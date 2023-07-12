package String1;

public class AtFirst {
    private String str;

    public AtFirst(String str) {
        this.str = str;
        System.out.println(make());
    }

    private String make() {
        return str.length() > 1 ? str.substring(0, 2) : str.substring(0, str.length()) + "@".repeat(2 - str.length());
    }

    private String make1() {
        if (str.length() > 1) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str + '@';
        } else {
            return "@@";
        }
    }
}
