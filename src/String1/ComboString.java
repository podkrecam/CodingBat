package String1;

public class ComboString {
    private String a;
    private String b;

    public ComboString(String a, String b) {
        this.a = a;
        this.b = b;
        System.out.println(make1());
    }

    private String make() {
        if (a.length() > b.length()) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }

    private String make1() {
        return (a.length() > b.length()) ? b + a + b : a + b + a;
    }
}
