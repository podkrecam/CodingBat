package String2;

public class SameStarChar {
    private String str;

    public SameStarChar(String str) {
        this.str = str;
        System.out.println("SameStarChar: " + check());
    }

    private boolean check() {
        int countStars = 0;
        int starHasChars = 0;

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                countStars++;
                if (str.charAt(i - 1) == str.charAt(i + 1)) {
                    starHasChars++;
                }
            }
        }

        return countStars == starHasChars;
    }
}
