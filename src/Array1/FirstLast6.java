package Array1;

public class FirstLast6 {
    private int[] array;

    public FirstLast6(int[] array) {
        this.array = array;
        System.out.println(check());
    }

    private boolean check() {
        if (array[0] == 6 || array[array.length - 1] == 6) {
            return true;
        }
        return false;
    }
}
