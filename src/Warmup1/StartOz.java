package Warmup1;

public class StartOz {
    private String word;

    public StartOz(String word) {
        this.word = word;
        System.out.println("StartOz: " + check());
    }

    private String check() {
        String result = "";

        if (word.length() >= 1 && word.charAt(0) == 'o') {
            result = result + word.charAt(0);
        }

        if (word.length() >= 2 && word.charAt(1) == 'z') {
            result = result + word.charAt(1);
        }

        return result;
    }
}
