package String3;

public class SumNumbers {
    /*
    Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
    A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char
    is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

    sumNumbers("abc123xyz") → 123
    sumNumbers("aa11b33") → 44
    sumNumbers("7 11") → 18
     */
    private String str;

    public SumNumbers(String str) {
        this.str = str;
        System.out.println("SumNumbers: " + sum());
    }

    private int sum() {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int j = i;
                while (j < str.length() && Character.isDigit(str.charAt(j))) {
                    j++;
                }

                sum += Integer.parseInt(str.substring(i, j));
                i = j;
            }
        }

        return sum;
    }
}
