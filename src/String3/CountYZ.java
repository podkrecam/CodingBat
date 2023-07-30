package String3;

public class CountYZ {
    /*
    Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy"
    and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
    We'll say that a y or z is at the end of a word if there is not an alphabetic letter
    immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

    countYZ("fez day") → 2
    countYZ("day fez") → 2
    countYZ("day fyyyz") → 2
     */
    private String str;

    public CountYZ(String str) {
        this.str = str;
        System.out.println("CountYZ: " + count());
    }

    private int count() {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && !Character.isLetter(str.charAt(i)) && (str.substring(i - 1, i).equalsIgnoreCase("y") || str.substring(i - 1, i).equalsIgnoreCase("z"))) {
                counter++;
            }
            if (i == str.length() - 1 && (str.substring(i, i + 1).equalsIgnoreCase("y") || str.substring(i, i + 1).equalsIgnoreCase("z"))) {
                counter++;
            }
        }

        return counter;
    }
}
