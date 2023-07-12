package String1;

public class MakeOutWord {
    private String out;
    private String word;

    public MakeOutWord(String out, String word) {
        this.out = out;
        this.word = word;
        System.out.println(makeWord());
    }

    private String makeWord() {
        return out.substring(0, 2) + word + out.substring(2);
    }
}
