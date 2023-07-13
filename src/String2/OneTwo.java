package String2;

public class OneTwo {
    /*
    Given a string, compute a new string by moving the first char to come after the next two chars,
    so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars,
    so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
     */
    private String str;

    public OneTwo(String str) {
        this.str = str;
        System.out.println("OneTwo: " + make());
    }

    private String make() {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < str.length() - 2; i += 3) {
            temp.append(str, i + 1, i + 3);
            temp.append(str.charAt(i));
        }
        return temp.toString();
    }
}
