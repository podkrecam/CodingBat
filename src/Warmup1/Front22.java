package Warmup1;

public class Front22 {
    private String word;

    public Front22(String word) {
        this.word = word;
        System.out.println(addTwoChars());
    }

    private String addTwoChars() {

        if (word.length() < 2) {
            return word.repeat(3);
        } else {
            String twoChars = word.substring(0, 2);
            return twoChars + word + twoChars;
        }
    }
}
