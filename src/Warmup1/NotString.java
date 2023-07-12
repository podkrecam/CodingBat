package Warmup1;

public class NotString {
    private String word;

    public NotString(String word) {
        this.word = word;
        System.out.println(addNot());
    }

    private String addNot() {
        if (word.startsWith("not")) {
            return word;
        } else {
            return "not " + word;
        }
    }
}
