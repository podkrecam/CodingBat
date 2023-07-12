package Warmup1;

public class Front3 {
    private String word;

    public Front3(String word) {
        this.word = word;
        System.out.println(triple());
    }

    private String triple() {
        if (word.length() < 3) {
            return word.repeat(3);
        } else {
            return word.substring(0, 3).repeat(3);
        }
    }
}
