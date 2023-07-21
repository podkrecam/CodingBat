package Array2;

public class MainArray2 {
    public static void main(String[] args) {
        int[] arrayCountEvens = {2, 1, 2, 9, 4};
        CountEvens countEvens = new CountEvens(arrayCountEvens); // expected 3
        BigDiff bigDiff = new BigDiff(arrayCountEvens);
        int[] centeredAverageArray = {1, 1, 99, 99};
        CenteredAverage centeredAverage = new CenteredAverage(centeredAverageArray);
    }
}
