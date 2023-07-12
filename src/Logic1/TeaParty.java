package Logic1;

public class TeaParty {
    private int tea;
    private int candy;

    public TeaParty(int tea, int candy) {
        this.tea = tea;
        this.candy = candy;
        System.out.println("TeaParty: " + party());
    }

    private int party() {
        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2;
        }
        return 1;
    }
}
