package String1;

public class EndsLy {
    private String str;

    public EndsLy(String str) {
        this.str = str;
        System.out.println(make());
    }

    private boolean make() {
        return str.length() > 1 && str.substring(str.length() - 2).equals("ly");
    }
}
