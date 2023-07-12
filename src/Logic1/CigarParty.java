package Logic1;

public class CigarParty {
    private int cigars;
    private boolean isWeekend;

    public CigarParty(int cigars, boolean isWeekend) {
        this.cigars = cigars;
        this.isWeekend = isWeekend;
        System.out.println("CigarParty: " + check());
    }

    private boolean check() {
        if (isWeekend && cigars >= 40 || !isWeekend && cigars >= 40 && cigars <= 60) {
            return true;
        }
        return false;
    }
}
