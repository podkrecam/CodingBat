package String1;

public class FirstTwo {
    private String str;

    public FirstTwo(String str) {
        this.str = str;
        System.out.println(make());
    }

    private String make() {
        String temp = str;
        if (str.length() > 1) {
            temp = str.substring(0, 2);
        }
        return temp;
    }
}
