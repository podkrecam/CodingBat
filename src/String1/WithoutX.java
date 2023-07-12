package String1;

public class WithoutX {
    private String str;

    public WithoutX(String str) {
        this.str = str;
        System.out.println(make());
    }

    private String make() {
        if (str.length() > 1) {
            if (str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {
                return str.substring(1, str.length() - 1);
            } else if (str.charAt(str.length() - 1) == 'x') {
                return str.substring(0, str.length() - 1);
            } else if (str.charAt(0) == 'x') {
                return str.substring(1);
            }
        } else if (str.length() == 1 && str.charAt(0) == 'x') {
            return "";
        }
        return str;
    }
}
