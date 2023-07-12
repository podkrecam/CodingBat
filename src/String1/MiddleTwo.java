package String1;

public class MiddleTwo {
    private String str;

    public MiddleTwo(String str) {
        this.str = str;
        System.out.println(make());
    }

    private String make() {
        return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
    }
}
