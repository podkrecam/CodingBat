package String2;

public class GetSandwich {
    private String str;
    private int counter = 0;

    public GetSandwich(String str) {
        this.str = str;
        System.out.println("GetSandwich: " + get() + " ,LoopCounter: " + counter);
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

        return start < end ? str.substring(start, end) : "";
    }
}
