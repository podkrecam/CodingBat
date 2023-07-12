package Warmup1;

public class MissingChar {
    private String word;
    private int character;

    public MissingChar(String word, int character) {
        this.word = word;
        this.character = character;
        System.out.println(deleteChar());
    }

    private String deleteChar() {
        return word.replace(String.valueOf(word.charAt(character)), "");
    }
}
