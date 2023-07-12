package Warmup1;

public class DelDel {
    private String word;

    public DelDel(String word) {
        this.word = word;
        System.out.println("DelDel: " + del());
    }

    private String del() {
        if (word.length() <= 3) {
            return word;
        } else {
            if (word.substring(1, 4).equals("del")) {
                return word.charAt(0) + word.substring(4);
            }
            return word;
        }
    }
}
