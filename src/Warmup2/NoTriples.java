package Warmup2;

public class NoTriples {
    private int[] array;

    public NoTriples(int[] array) {
        this.array = array;
        System.out.println("NoTriples: " + check());
    }

    private boolean check() {
        boolean isTriple = true;
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] == array[i + 1] && array[i + 1] == array[i + 2]) {
                isTriple = false;
            }
        }
        return isTriple;
    }
}
