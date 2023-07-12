package String1;

public class LastChars {
    private String a;
    private String b;

    public LastChars(String a, String b) {
        this.a = a;
        this.b = b;
        System.out.println(make());
    }

    private String make() {
        if (a.length() > 0 && b.length() > 0) {
            return a.substring(0, 1).concat(b.substring(b.length() - 1));
        } else if (a.length() > 0) {
            return a.substring(0, 1).concat("@");
        } else if (b.length() > 0) {
            return "@".concat(b.substring(b.length() - 1));
        } else {
            return "@@";
        }
    }

    private String make1() {
        if (a.isEmpty() && b.isEmpty()) {
            return "@@";
        } else if (a.isEmpty()) {
            return "@" + b.charAt(b.length() - 1);
        } else if (b.isEmpty()) {
            return a.charAt(0) + "@";
        } else {
            return a.substring(0, 1) + b.substring(b.length() - 1);
        }
    }
}
