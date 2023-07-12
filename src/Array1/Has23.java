package Array1;

public class Has23 {
    private int[] array;

    public Has23(int[] array) {
        this.array = array;
        System.out.println(check());
    }

    private boolean check() {
        boolean has23 = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2 || array[i] == 3) {
                has23 = true;
            }
        }
        return has23;
    }
}
