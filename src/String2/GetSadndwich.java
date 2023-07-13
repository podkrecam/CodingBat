package String2;

public class GetSadndwich {
    private String str;
    private int counter = 0;

    public GetSadndwich(String str) {
        this.str = str;
        System.out.println("GetSandwich: " + get() + " " + counter);
    }

    private String get() {
        int start = 0;
        int end = 0;

        if (str.contains("bread")) {

            for (int i = 0; i < str.length(); i++) {
                counter++;
                if (str.startsWith("bread", i)) {
                    start = i + 5;
                    i = str.length();
                }
            }

            for (int j = str.length(); j > 0; j--) {
                counter++;
                if (str.startsWith("bread", j - 5)) {
                    end = j - 5;
                    j = 0;
                }
            }
        }

        if (start < end) {
            return str.substring(start, end);
        } else {
            return "";
        }
    }
}
