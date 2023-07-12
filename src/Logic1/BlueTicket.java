package Logic1;

public class BlueTicket {
    private int a;
    private int b;
    private int c;

    public BlueTicket(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("BlueTicket: " + ticket());
    }

    private int ticket() {
        int sum = 0;
        if (a + b == 10 || a + c == 10 || b + c == 10) {
            sum = 10;
        } else if (a + b == a + c + 10 || a + b == b + c + 10) {
            sum = 5;
        }
        return sum;
    }
}
