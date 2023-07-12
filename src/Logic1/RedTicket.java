package Logic1;

public class RedTicket {
    private int a;
    private int b;
    private int c;

    public RedTicket(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("RedTicket: " + ticket());
    }

    private int ticket() {
        if (a == 2 && a == b && b == c) {
            return 10;
        } else if (a != 2 && b != 2 && c != 2) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        }
        return 0;
    }
}
