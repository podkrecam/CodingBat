package Warmup2;

public class StringMatch {
    private String a;
    private String b;

    public StringMatch(String a, String b) {
        this.a = a;
        this.b = b;
        System.out.println("StringMatch: " + match());
    }

    private int match() {
        int counter = 0;
        int minLength = Math.min(a.length(), b.length());
        for (int i = 0; i < minLength - 1; i++) {
            if (a.charAt(i) == b.charAt(i) && a.charAt(i + 1) == b.charAt(i + 1)) {
                counter++;
            }
        }
        return counter;
    }
}
