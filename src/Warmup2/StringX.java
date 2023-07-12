package Warmup2;

public class StringX {
    private String str;

    public StringX(String str) {
        this.str = str;
        System.out.println("StringX: " + removeX());
    }

    private String removeX() {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(i > 0 && i < str.length() - 1 && str.charAt(i) == 'x')) {
                temp += str.charAt(i);
            }
        }
        return temp;
    }
}
