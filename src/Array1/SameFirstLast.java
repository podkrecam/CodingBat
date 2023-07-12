package Array1;

public class SameFirstLast {
    private int[] array;

    public SameFirstLast(int[] array) {
        this.array = array;
        System.out.println(check());
    }

    private boolean check() {
        return array.length > 0 && array[0] == array[array.length - 1];
    }
}
