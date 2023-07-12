package String2;

public class RepeatEnd {
    private String str;
    private int n;

    public RepeatEnd(String str, int n) {
        this.str = str;
        this.n = n;
        System.out.println("RepeatEnd: " + repeat());
    }

    private String repeat() {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < n; i++) {
            temp.append(str.substring(str.length() - n));
        }
        return temp.toString();
    }
}
