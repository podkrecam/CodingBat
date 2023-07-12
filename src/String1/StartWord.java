package String1;

public class StartWord {
    private String str;
    private String word;

    public StartWord(String str, String word) {
        this.str = str;
        this.word = word;
        System.out.println(make());
    }

    private String make() {
        int minL = Math.min(str.length(), word.length());
        if (str.length() >= word.length()) {
            if (str.substring(1, minL).equals(word.substring(1, minL))) {
                return str.substring(0, minL);
            }
        }
        return "";
    }
}
