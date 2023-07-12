package String1;

public class Right2 {
    private String a;

    public Right2(String a) {
        this.a = a;
        System.out.println(make());
    }

    private String make() {
        return a.substring(a.length() - 2) + a.substring(0, a.length() - 2);
    }
}
