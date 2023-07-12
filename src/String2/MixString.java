package String2;

public class MixString {
    private String a;
    private String b;

    public MixString(String a, String b) {
        this.a = a;
        this.b = b;
        System.out.println("MixString: " + mix());
    }

    private String mix() {
        StringBuilder temp = new StringBuilder();
        int max = Math.max(a.length(), b.length());
        for (int i = 0; i < max; i += 1) {
            if (i < a.length()) {
                temp.append(a.charAt(i));
            }
            if (i < b.length()) {
                temp.append(b.charAt(i));
            }
        }
        return temp.toString();
    }
}
