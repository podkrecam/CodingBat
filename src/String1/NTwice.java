package String1;

public class NTwice {
    private String str;
    private int n;

    public NTwice(String str, int n) {
        this.str = str;
        this.n = n;
        System.out.println(make());
    }

    private String make() {
        return str.substring(0, n) + str.substring(str.length() - n);
    }
}
