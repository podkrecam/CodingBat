package Warmup2;

public class StringTimes {
    private String word;
    private int n;

    public StringTimes(String word, int n) {
        this.word = word;
        this.n = n;
        System.out.println("StringTimes: " + repeatFor());
    }

    private String repeat() {
        return word.repeat(n);
    }

    private String repeatFor() {
        String temp = "";
        for (int i = 0; i < n; i++) {
            temp += word;
        }
        return temp;
    }
}
