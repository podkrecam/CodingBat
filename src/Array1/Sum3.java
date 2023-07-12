package Array1;

public class Sum3 {
    private int[] array;

    public Sum3(int[] array) {
        this.array = array;
        System.out.println(sum());
    }

    private int sum() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
