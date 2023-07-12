package String1;

public class DeFront {
    private String str;

    public DeFront(String str) {
        this.str = str;
        System.out.println(make());
    }

    private String make() {
        if (str.length() > 1) {
            if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
                return str;
            } else if (str.charAt(0) == 'a') {
                return str.substring(0, 1) + str.substring(2);
            } else if (str.charAt(1) == 'b') {
                return str.substring(1);
            } else {
                return str.substring(2);
            }
        }
        return "";
    }
}
