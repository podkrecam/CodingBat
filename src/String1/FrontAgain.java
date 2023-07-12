package String1;

public class FrontAgain {
    private String str;

    public FrontAgain(String str) {
        this.str = str;
        System.out.println(check());
    }

    private boolean check() {
        return str.length() > 1 && str.substring(0, 2).equals(str.substring(str.length() - 2));
    }
}
