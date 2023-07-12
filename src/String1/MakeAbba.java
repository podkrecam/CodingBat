package String1;

public class MakeAbba {
    private String a;
    private String b;

    public MakeAbba(String a, String b) {
        this.a = a;
        this.b = b;
        System.out.println(make());
    }

    private String make() {
        return a + b + b + a;
    }
}
