package Array1;

public class Unlucky1 {
    private int[] array;

    public Unlucky1(int[] array) {
        this.array = array;
        System.out.println(check());
    }

    private boolean check() {
        boolean isUnlucky = false;
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] == 1 && array[i + 1] == 3) && (i < 2 || i > array.length - 3)) {
                isUnlucky = true;
            }
        }
        return isUnlucky;
    }
}
