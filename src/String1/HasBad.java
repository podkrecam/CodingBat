package String1;

public class HasBad {
    private String str;

    public HasBad(String str) {
        this.str = str;
        System.out.println(check());
    }

    private boolean check() {
        return str.length() > 3 && (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")) || (str.length() == 3 && str.charAt(0) == 'b');
    }
}
