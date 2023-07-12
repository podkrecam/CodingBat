package String1;

public class Left2 {
    private String a;

    public Left2(String a) {
        this.a = a;
        System.out.println(make());
    }

    private String make() {
        return a.substring(2) + a.substring(0, 2);
    }
}
