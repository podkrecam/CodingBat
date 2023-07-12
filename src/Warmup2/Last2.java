package Warmup2;

public class Last2 {
    private String word;

    public Last2(String word) {
        this.word = word;
        System.out.println("Last2: " + repated());
    }

    private int repated() {
        int counter = 0;
        for (int i = 0; i < word.length() - 2; i++) {
            if (word.substring(word.length() - 2).equals(word.substring(i, i + 2))) {
                counter++;
            }
        }
        return counter;
    }
}
