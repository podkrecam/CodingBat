package String2;

public class CatDog {
    private String str;

    public CatDog(String str) {
        this.str = str;
        System.out.println("CatDog: " + check());
    }

    private boolean check() {
        int catCounter = 0;
        int dogCounter = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                catCounter++;
            }
            if ((str.substring(i, i + 3)).equals("dog")) {
                dogCounter++;
            }
        }
        return catCounter == dogCounter;
    }
}
