package Array1;

public class Double23 {
    private int[] array;

    public Double23(int[] array) {
        this.array = array;
        System.out.println(check());
    }

    private boolean check() {
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 2) {
                count2++;
            }
            if (array[i] == 3) {
                count3++;
            }
        }
        return count2 == 2 || count3 == 2;
    }

    private boolean check1() {
        if (array.length <= 1) {
            return false;
        } else {
            return array[0] == 2 && array[1] == 2 || array[0] == 3 && array[1] == 3;
        }
    }
}
