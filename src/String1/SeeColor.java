package String1;

public class SeeColor {
    private String str;

    public SeeColor(String str) {
        this.str = str;
        System.out.println(make());
    }

    private String make() {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }
}
