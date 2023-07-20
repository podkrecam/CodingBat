package String2;

public class PlusOut {
    private String str;
    private String word;

    public PlusOut(String str, String word) {
        this.str = str;
        this.word = word;
        System.out.println("PlusOut: " + make());
    }

    private String make() {
        String temp = "";

        for (int i = 0; i < str.length(); ) {
            if (!str.startsWith(word, i)) {
                temp += "+";
                i++;
            } else {
                temp += word;
                i += word.length();
            }
        }
        return temp;
    }

    private String make1() {
        String temp = "";
        int i = 0;

        while (i < str.length()) {
            if (!str.startsWith(word, i)) {
                temp += "+";
                i++;
            } else {
                temp += word;
                i += word.length();
            }
        }
        return temp;
    }
}
