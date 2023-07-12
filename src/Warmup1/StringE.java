package Warmup1;

public class StringE {
    private String word;

    public StringE(String word) {
        this.word = word;
        System.out.println("StringE: " + check());
    }

    private boolean check() {

        int counter = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e') {
                counter++;
            }
        }

        return counter > 0 && counter < 4;
    }
}
