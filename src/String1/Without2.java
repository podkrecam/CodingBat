package String1;

public class Without2 {
    private String str;

    public Without2(String str) {
        this.str = str;
        System.out.println(make());
    }

    private String make() {
        if (str.length() > 1 && str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str.substring(2);
        } else if (str.length() > 1 && str.substring(0, 1).equals(str.substring(str.length() - 1))) {
            return str.substring(1);
        } else {
            return str;
        }
    }
}
