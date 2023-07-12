package Warmup2;

public class Has271 {
    private int[] array;

    public Has271(int[] array) {
        this.array = array;
        System.out.println("Has271: " + check());
    }

    private boolean check() {
        boolean has271 = false;
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i + 1] == array[i] + 5 && Math.abs(array[i + 2] - array[i] - 1) <= 2) {
                has271 = true;
            }
        }
        return has271;
    }
}
