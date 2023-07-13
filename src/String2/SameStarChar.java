package String2;

public class SameStarChar {
    /*
    Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
     */
    private String str;

    public SameStarChar(String str) {
        this.str = str;
        System.out.println("SameStarChar: " + check());
    }

    private boolean check() {
        int countStars = 0;
        int starHasChars = 0;

        for (int i = 1; i < str.length() - 1; i++) {
            // check if char at index is *
            if (str.charAt(i) == '*') {
                countStars++;
                // if char at index i is * check if the char before and after are the same
                if (str.charAt(i - 1) == str.charAt(i + 1)) {
                    starHasChars++;
                }
            }
        }

        return countStars == starHasChars;
    }
}
