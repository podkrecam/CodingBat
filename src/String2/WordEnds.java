package String2;

public class WordEnds {
    /*
    Given a string and a non-empty word string, return a string made of each char just before
    and just after every appearance of the word in the string. Ignore cases where there is no
    char before or after the word, and a char may be included twice if it is between two words.
     */
    private String str;
    private String word;
    private int counter;

    public WordEnds(String str, String word) {
        this.str = str;
        this.word = word;
//        System.out.println("PlusOut: " + make() + " LoopCounter: " + counter);
//        System.out.println("PlusOut: " + make1() + " LoopCounter1: " + counter);
        System.out.println("PlusOut: " + make2() + " LoopCounter2: " + counter);
//        System.out.println("PlusOut: " + make3() + " LoopCounter3: " + counter);
    }


    // First three ideas are mine, they are similar to each other but the second one and the third one have better algorithms when the word.length > 1
    private String make() {
        String temp = "";
        counter = 0;

        for (int i = 0; i < str.length(); i++) {
            counter++;
            if (str.startsWith(word, i) && str.length() > word.length()) {
                if (i == 0) {
                    temp += str.charAt(i + word.length());
                } else if (i == str.length() - word.length()) {
                    temp += str.charAt(i - 1);
                } else {
                    temp += str.charAt(i - 1);
                    temp += str.charAt(i + word.length());
                }
            }
        }
        return temp;
    }

    private String make1() {
        counter = 0;
        String temp = "";
        int i = 0;

        while (i < str.length()) {
            counter++;
            if (str.startsWith(word, i) && str.length() > word.length()) {
                if (i == 0) {
                    temp += str.charAt(i + word.length());
                    i += word.length();
                } else if (i == str.length() - word.length()) {
                    temp += str.charAt(i - 1);
                    i += word.length();
                } else {
                    temp += str.charAt(i - 1);
                    temp += str.charAt(i + word.length());
                    i += word.length();
                }
            } else {
                i++;
            }
        }
        return temp;
    }

    private String make2() {
        String temp = "";
        counter = 0;

        for (int i = 0; i < str.length(); ) {
            counter++;
            if (str.startsWith(word, i) && str.length() > word.length()) {
                if (i == 0) {
                    temp += str.charAt(i + word.length());
                    i += word.length();
                } else if (i == str.length() - word.length()) {
                    temp += str.charAt(i - 1);
                    i += word.length();
                } else {
                    temp += str.charAt(i - 1);
                    temp += str.charAt(i + word.length());
                    i += word.length();
                }
            } else {
                i++;
            }
        }
        return temp;
    }

    private String make3() {
        // not my idea
        String result = "";
        counter = 0;
        int i = 0;
        int end = 0;
        int l = str.length();
        while (i < str.length()) {
            counter++;
            end = i + word.length();
            if (end > l) {
                end = l;
            }

            if (str.substring(i, end).equals(word)) {

                if (i > 0) {
                    result = result + str.charAt(i - 1);
                }

                if (i + word.length() < l) {
                    result = result + str.charAt(end);
                }

            }
            i++;
        }
        return result;
    }
}
