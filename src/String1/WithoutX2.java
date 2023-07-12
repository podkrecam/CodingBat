package String1;

public class WithoutX2 {
    private String str;

    public WithoutX2(String str) {
        this.str = str;
        System.out.println(make());
    }

    private String make() {
        if (str.length() > 0) {
            if (str.startsWith("xx")) {
                return str.substring(2);
            } else if (str.charAt(0) == 'x') {
                return str.substring(1);
            } else if (str.charAt(1) == 'x') {
                return str.charAt(0) + str.substring(2);
            } else {
                return str;
            }
        }
        return str;
    }
}
