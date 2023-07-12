package String1;

public class WithoutEnd2 {
    private String str;

    public WithoutEnd2(String str) {
        this.str = str;
        System.out.println(make());
    }

    private String make() {
        return str.length() > 2 ? str.substring(1, str.length() - 1) : "";
    }
}
