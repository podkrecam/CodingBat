package Warmup1;

public class EndUp {
    private String word;

    public EndUp(String word) {
        this.word = word;
        System.out.println("EndUp: " + upper());
    }

    private String upper() {
        if (word.length() > 3) {
            return word.substring(0, word.length() - 3) + word.substring(word.length() - 3).toUpperCase();
        } else {
            return word.toUpperCase();
        }
    }
}

