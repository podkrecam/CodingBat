package String2;

public class DoubleChar {
    private String str;

    public DoubleChar(String str) {
        this.str = str;
        System.out.println("DoubleChar: " + make());
    }

    private String make() {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 2; j++) {
                temp += str.charAt(i);
            }
        }
        return temp;
    }

    private String make1() {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            temp += str.charAt(i);
            temp += str.charAt(i);
        }
        return temp;
    }
}
