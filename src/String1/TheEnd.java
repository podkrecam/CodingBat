package String1;

public class TheEnd {
    private String str;
    private boolean front;

    public TheEnd(String str, boolean front) {
        this.str = str;
        this.front = front;
        System.out.println(make());
    }

    private String make() {
        return front ? str.substring(0, 1) : str.substring(str.length() - 1);
    }
}
