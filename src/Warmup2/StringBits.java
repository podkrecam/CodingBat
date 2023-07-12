package Warmup2;

public class StringBits {
    private String word;

    public StringBits(String word) {
        this.word = word;
        System.out.println("StringBits: " + newWord());
    }

    private String newWord() {
        String temp = "";
        for (int i = 0; i < word.length(); i += 2) {
            temp += word.charAt(i);
        }
        return temp;
    }
}
