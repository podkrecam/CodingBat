package Warmup2;

public class AltPairs {
    private String str;

    public AltPairs(String str) {
        this.str = str;
        System.out.println("AltPairs: " + newWord());
    }

    private String newWord() {
        String temp = "";
        for (int i = 0; i < str.length(); i += 4) {
            temp += str.charAt(i);
            if (str.length() > i + 1) {
                temp += str.charAt(i + 1);
            }
        }
        return temp;
    }
}
