package String1;

public class MinCat {
    private String a;
    private String b;

    public MinCat(String a, String b) {
        this.a = a;
        this.b = b;
        System.out.println(make());
    }

    private String make() {
        int minL = Math.min(a.length(), b.length());
        return a.substring(a.length() - minL) + b.substring(b.length() - minL);
    }
}
