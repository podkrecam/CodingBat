package String1;

public class ExtraEnd {
    private String str;

    public ExtraEnd(String str) {
        this.str = str;
        System.out.println(make());
    }

    private String make() {
        return str.substring(str.length() - 2).repeat(3);
    }

    private String make1() {
        String end = str.substring(str.length() - 2);
        return end + end + end;
    }
}
