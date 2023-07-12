package String1;

public class NonStart {
    private String a;
    private String b;

    public NonStart(String a, String b) {
        this.a = a;
        this.b = b;
        System.out.println(make());
    }

    private String make() {
        return a.substring(1) + b.substring(1);
    }
}
