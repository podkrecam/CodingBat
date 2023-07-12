package String1;

public class MakeTags {
    private String tag;
    private String word;

    public MakeTags(String tag, String word) {
        this.tag = tag;
        this.word = word;
        System.out.println(makeTag());
    }

    private String makeTag() {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
}
