package String3;

public class MaxBlock {
    /*
    Given a string, return the length of the largest "block" in the string.
    A block is a run of adjacent chars that are the same.

    maxBlock("hoopla") → 2
    maxBlock("abbCCCddBBBxx") → 3
    maxBlock("") → 0
     */
    private String str;

    public MaxBlock(String str) {
        this.str = str;
        System.out.println("MaxBlock: " + count());
    }

    private int count() {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length() && str.charAt(i) == str.charAt(j); j++) {
                if (j - i >= counter) {
                    counter = j - i + 1;
                }
            }
        }

        return counter;
    }
}
