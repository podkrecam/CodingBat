package Array2;

public class MainArray2 {
    public static void main(String[] args) {
        int[] arrayCountEvens = {2, 1, 2, 9, 4};
        CountEvens countEvens = new CountEvens(arrayCountEvens); // expected 3
        BigDiff bigDiff = new BigDiff(arrayCountEvens);
        int[] centeredAverageArray = {1, 1, 99, 99};
        CenteredAverage centeredAverage = new CenteredAverage(centeredAverageArray);
        int[] sum13Array = {1, 2, 2, 1, 13};
        Sum13 sum13 = new Sum13(sum13Array);
        int[] sum67Array = {1, 6, 2, 2, 7, 1, 6, 99, 99, 7};
        Sum67 sum67 = new Sum67(sum67Array);
        Has22 has22 = new Has22(sum67Array);
        Lucky13 lucky13 = new Lucky13(arrayCountEvens);
        int[] sum28Array = {2, 3, 2, 2, 4, 1, 2};
        Sum28 sum28 = new Sum28(sum28Array);
    }
}
