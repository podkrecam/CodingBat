package Warmup2;

public class CountXX {
    private String word;

    public CountXX(String word) {
        this.word = word;
        System.out.println("CountXX: " + count());
    }

    private int count() {
        int counter = 0;
        if (word.length() > 1) {
            for (int i = 0; i < word.length() - 1; i++) {
                if (word.charAt(i) == word.charAt(i + 1) && word.charAt(i) == 'x') {
                    counter++;
                }
            }
        }
        return counter;
    }
}
