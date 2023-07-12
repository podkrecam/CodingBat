package Warmup1;

public class BackAround {
    private String word;

    public BackAround(String word) {
        this.word = word;
        System.out.println(back());
    }

    private String back() {
        char last = word.charAt(word.length() - 1);
        return last + word + last;
    }
}
