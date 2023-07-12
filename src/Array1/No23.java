package Array1;

public class No23 {
    private int[] array;

    public No23(int[] array) {
        this.array = array;
        System.out.println(check());
    }

    private boolean check() {
        boolean hasNo23 = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2 || array[i] == 3) {
                hasNo23 = false;
            }
        }
        return hasNo23;
    }
}
