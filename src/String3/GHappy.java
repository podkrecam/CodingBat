package String3;

public class GHappy {
    /*
    We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
    immediately to its left or right. Return true if all the g's in the given string are happy.

    gHappy("xxggxx") → true
    gHappy("xxgxx") → false
    gHappy("xxggyygxx") → false
     */
    private String str;

    public GHappy(String str) {
        this.str = str;
        System.out.println("GHappy: " + check());
    }

    private boolean check() {
        int countG = 0;
        int countHappy = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                countG++;
                if (i < str.length() - 1 && str.charAt(i + 1) == 'g') {
                    countHappy++;
                } else if (i > 0 && str.charAt(i - 1) == 'g') {
                    countHappy++;
                }
            }
        }

        return countG == countHappy;
    }
}
