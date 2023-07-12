package String2;

public class CountHi {
    private String str;

    public CountHi(String str) {
        this.str = str;
        System.out.println("CountHi: " + count());
    }

    private int count() {
        int counter = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                counter++;
            }
        }
        return counter;
    }
}
