package Warmup2;

public class FrontTimes {
    private String word;
    private int n;

    public FrontTimes(String word, int n) {
        this.word = word;
        this.n = n;
        System.out.println("FrontTimes: " + repeat());
    }

    private String repeat() {
        String temp = "";
        if (word.length() > 2) {
            for (int i = 0; i < n; i++) {
                temp += word.substring(0, 3);
            }
        } else {
            for (int i = 0; i < n; i++) {
                temp += word.substring(0, word.length());
            }
        }
        return temp;
    }
}
