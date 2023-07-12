package String1;

public class WithoutEnd {
    private String str;

    public WithoutEnd(String str) {
        this.str = str;
        System.out.println(make());
    }

    private String make() {
        return str.substring(1, str.length() - 1);
    }
}
