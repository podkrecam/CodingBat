package Warmup2;

public class StringSplosion {
    private String word;

    public StringSplosion(String word) {
        this.word = word;
        System.out.println("StringSplosion: " + newWord());
    }

    private String newWord() {
        String temp = "";
        for (int i = 0; i < word.length(); i++) {
            temp += word.substring(0, i + 1);
        }
        return temp;
    }
}
