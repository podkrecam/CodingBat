package Array2;

public class CenteredAverage {
    /*
    Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
    except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value,
    ignore just one copy, and likewise for the largest value.
    Use int division to produce the final average. You may assume that the array is length 3 or more.


    centeredAverage([1, 2, 3, 4, 100]) → 3
    centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
    centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
     */
    private int[] array;

    public CenteredAverage(int[] array) {
        this.array = array;
        System.out.println("CenteredAverage: " + average());
    }

    private int average() {
        int minIndex = 0;
        int maxIndex = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxIndex]) maxIndex = i;
            if (array[i] <= array[minIndex]) minIndex = i;
        }
        for (int i = 0; i < array.length; i++) {
            if (i != maxIndex && i != minIndex) {
                sum += array[i];
            }
        }
        return sum / (array.length - 2);
    }
}
