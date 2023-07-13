package String2;

public class ZipZap {
    /*

Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
     */
    private String str;

    public ZipZap(String str) {
        this.str = str;
        System.out.println("ZipZap: " + make());
    }

    private String make() {
        StringBuilder temp = new StringBuilder(str);

        if (str.length() > 2) {

            temp = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                    temp.append(str.charAt(i));
                    temp.append(str.charAt(i + 2));
                    i += 2;
                } else {
                    temp.append(str.charAt(i));
                }
            }
        }

        return temp.toString();
    }
}
