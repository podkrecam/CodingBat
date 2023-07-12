package String1;

public class TwoChar {
    private String str;
    private int index;

    public TwoChar(String str, int index) {
        this.str = str;
        this.index = index;
        System.out.println(make());
    }

    private String make() {
        return (index < str.length() - 1 && index > 0) ? str.substring(index, index + 2) : str.substring(0, 2);
    }
}
