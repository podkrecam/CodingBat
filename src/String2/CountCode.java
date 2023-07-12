package String2;

public class CountCode {
    private String str;

    public CountCode(String str) {
        this.str = str;
        System.out.println("CountCode: " + count());
    }

    private int count() {
        int counter = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.startsWith("co", i) && str.charAt(i + 3) == 'e') {
                counter++;
            }
        }
        return counter;
    }
}
