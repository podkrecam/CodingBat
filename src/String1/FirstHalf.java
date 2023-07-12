package String1;

public class FirstHalf {
    private String str;

    public FirstHalf(String str) {
        this.str = str;
        System.out.println(make());
    }

    private String make() {
        return str.substring(0, str.length() / 2);
    }
}
