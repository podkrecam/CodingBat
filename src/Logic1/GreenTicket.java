package Logic1;

public class GreenTicket {
    private int a;
    private int b;
    private int c;

    public GreenTicket(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("GreenTicket: " + ticket());
    }

    private int ticket() {
        int result = 0;
        if (a == b || a == c || b == c) {
            result = 10;
        }
        if (a == b && b == c) {
            return 20;
        }
        return result;
    }
}
