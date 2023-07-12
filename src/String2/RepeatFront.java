package String2;

public class RepeatFront {
    private String str;
    private int n;

    public RepeatFront(String str, int n) {
        this.str = str;
        this.n = n;
        System.out.println("RepeatFront: " + repeat());
    }

    private String repeat() {
        StringBuilder temp = new StringBuilder();
        int tempNum = n;
        for (int i = 0; i < n; i++) {
            temp.append(str, 0, tempNum);
            tempNum--;
        }
        return temp.toString();
    }
}
