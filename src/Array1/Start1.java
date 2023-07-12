package Array1;

public class Start1 {
    private int[] a;
    private int[] b;

    public Start1(int[] a, int[] b) {
        this.a = a;
        this.b = b;
        System.out.println(countOne());
    }

    private int countOne() {
        int counter = 0;
        for (int i = 0; i < a.length && i < 2; i++) {
            if (a[i] == 1) {
                counter++;
            }
        }
        for (int j = 0; j < b.length && j < 2; j++) {
            if (b[j] == 1) {
                counter++;
            }
        }
        return counter;
    }

    private int countOne1() {
        int count = 0;
        if (a.length > 0 && a[0] == 1) {
            count++;
        }
        if (b.length > 0 && b[0] == 1) {
            count++;
        }
        return count;
    }
}
