package Warmup1;

public class StartHi {
    private String word;

    public StartHi(String word) {
        this.word = word;
        System.out.println(check());
    }

    private boolean check() {
        return word.length() > 1 && word.substring(0, 2).equals("hi");
    }
}
