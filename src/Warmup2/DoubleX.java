package Warmup2;

public class DoubleX {
    private String word;

    public DoubleX(String word) {
        this.word = word;
        System.out.println("DoubleX: " + check());
    }

    private boolean check() {
        boolean temp = false;
        if (word.length() > 1 && word.indexOf('x') != word.length() - 1) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'x' && word.charAt(i + 1) != 'x') {
                    temp = false;
                    break;
                }
                if (word.charAt(i) == 'x' && word.charAt(i + 1) == 'x') {
                    temp = true;
                    break;
                }
            }
        }
        return temp;
    }
}
