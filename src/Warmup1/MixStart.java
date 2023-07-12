package Warmup1;

public class MixStart {
    private String word;

    public MixStart(String word) {
        this.word = word;
        System.out.println("MixStart: " + check());
    }

    private boolean check() {
        return word.length() > 2 && word.substring(1, 3).equals("ix");
    }
}
