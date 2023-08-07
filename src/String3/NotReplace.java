package String3;

public class NotReplace {
    /*
    Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
    The word "is" should not be immediately proceeded or followed by a letter -- so for example the "is" in "this"
    does not count. (Note: Character.isLetter(char) tests if a char is a letter.)

    notReplace("is test") → "is not test"
    notReplace("is-is") → "is not-is not"
    notReplace("This is right") → "This is not right"
     */
    private String str;

    public NotReplace(String str) {
        this.str = str;
        System.out.println("NotReplace: " + create());
    }

    private String create() {
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.startsWith("is", i)) {
                temp += "is";
                if (i == 0 && str.length() > 2 && !Character.isLetter(str.charAt(i + 2))) {
                    temp += " not";
                } else if (i < str.length() - 2 && !Character.isLetter(str.charAt(i + 2)) && !Character.isLetter(str.charAt(i - 1))) {
                    temp += " not";
                } else if (str.length() > 2 && i == str.length() - 2 && !Character.isLetter(str.charAt(i - 1))) {
                    temp += " not";
                } else if (str.length() == 2) {
                    temp += " not";
                }
                i++;
            } else {
                temp += str.charAt(i);
            }
        }

        return temp;
    }
}
