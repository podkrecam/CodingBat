package Warmup1;

public class FrontBack {
    private String word;

    public FrontBack(String word) {
        this.word = word;
        System.out.println(replace());
    }

    private String replace() {
        if (word.length() > 1) {
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);
            String newWord = last + word.substring(1, word.length() - 1) + first;
            return newWord;
        } else {
            return word;
        }
    }

    // another solution
    private String replace1() {
        if (word.length() < 2) {
            return word;
        } else {
            String first = word.substring(0, 1);
            String last = word.substring(word.length() - 1);
            return last + word.substring(1, word.length() - 1) + first;
        }
    }
}


