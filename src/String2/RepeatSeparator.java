package String2;

public class RepeatSeparator {
    private String word;
    private String sep;
    private int count;

    public RepeatSeparator(String word, String sep, int count) {
        this.word = word;
        this.sep = sep;
        this.count = count;
        System.out.println("RepeatSeparator: " + repeat());
    }

    private String repeat() {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < count; i++) {
            temp.append(word);
            if (i + 1 < count) {
                temp.append(sep);
            }
        }
        return temp.toString();
    }
}
