package Warmup1;

public class EveryNth {
    private String word;
    private int a;

    public EveryNth(String word, int a) {
        this.word = word;
        this.a = a;
        System.out.println("EveryNth: " + nchar());
    }

    private String nchar() {
        String temp = "";
        for (int i = 0; i < word.length(); i += a) {
            temp += word.charAt(i);
        }
        return temp;
    }
}
