package String1;

public class LastTwo {
    private String str;

    public LastTwo(String str) {
        this.str = str;
        System.out.println(make());
    }

    private String make() {
        return str.length() > 1 ? str.substring(0, str.length() - 2) + (str.substring(str.length() - 1) + (str.substring(str.length() - 2, str.length() - 1))) : str;
    }

    private String make1() {
        int length = str.length();
        if (length <= 1) {
            return str;
        } else {
            return str.substring(0, length - 2) + str.substring(length - 1) + str.substring(length - 2, length - 1);
        }
    }
}
