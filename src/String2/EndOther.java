package String2;

public class EndOther {
    private String a;
    private String b;

    public EndOther(String a, String b) {
        this.a = a;
        this.b = b;
        System.out.println("EndOther: " + check());
    }

    private boolean check() {
        return a.toLowerCase().endsWith(b.toLowerCase()) || b.toLowerCase().endsWith(a.toLowerCase());
    }
}
