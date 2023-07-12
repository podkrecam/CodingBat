package String1;

public class ConCat {
    private String a;
    private String b;

    public ConCat(String a, String b) {
        this.a = a;
        this.b = b;
        System.out.println(make());
    }

    private String make() {
        if (a.length() > 0 && b.length() > 0) {
            if (a.charAt(a.length() - 1) == b.charAt(0)) {
                return a.substring(0, a.length() - 1).concat(b);
            }
        } else if (a.length() == 0) {
            return b;
        } else {
            return a;
        }
        return a + b;
    }

    private String make1() {
        if (a.isEmpty()) {
            return b;
        } else if (b.isEmpty()) {
            return a;
        } else {
            return (a.charAt(a.length() - 1) == b.charAt(0)) ? a.substring(0, a.length() - 1) + b : a + b;
        }
    }
}
