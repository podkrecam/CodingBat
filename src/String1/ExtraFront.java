package String1;

public class ExtraFront {
    private String str;

    public ExtraFront(String str) {
        this.str = str;
        System.out.println(make());
    }

    private String make() {
        return str.length() > 1 ? str.substring(0, 2).repeat(3) : str.repeat(3);
    }

    private String make1() {
        return str.length() > 1 ? str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2) : str + str + str;
    }
}
