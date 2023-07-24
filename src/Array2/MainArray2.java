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
        int[] more14Array = {1, 4, 1, 4, 1, 6};
        More14 more14 = new More14(more14Array);
        FizzArray fizzArray = new FizzArray(10);
        Only14 only14 = new Only14(more14Array);
        FizzArray2 fizzArray2 = new FizzArray2(10);
        int[] no14Array = {1, 2, 3, 4};
        No14 no14 = new No14(no14Array);
        int[] isEverywhereArray = {2, 1, 2, 2, 2, 1, 1, 2};
        IsEverywhere isEverywhere = new IsEverywhere(isEverywhereArray, 2);
        int[] either24Array = {1, 2, 3, 2, 2, 4, 4};
        Either24 either24 = new Either24(either24Array);
        int[] matchUpArray1 = {1, 2, 3};
        int[] matchUpArray2 = {2, 3, 10};
        MatchUp matchUp = new MatchUp(matchUpArray1, matchUpArray2);
        int[] has77Array = {2, 7, 2, 2, 7, 2};
        Has77 has77 = new Has77(has77Array);
        int[] has12Array = {3, 1, 4, 1, 6, 2};
        Has12 has12 = new Has12(has12Array);
        int[] modThreeArray = {9, 7, 2, 9, 2, 2, 6};
        ModThree modThree = new ModThree(modThreeArray);
        int[] haveThreeArray = {1, 3, 1, 3, 1, 3, 4, 3};
        HaveThree haveThree = new HaveThree(haveThreeArray);
        int[] twoTwoArray = {2, 2, 7, 2, 1};
        TwoTwo twoTwo = new TwoTwo(twoTwoArray);
        int[] sameEndsArray = {5, 6, 45, 99, 13, 5, 6};
        SameEnds sameEnds = new SameEnds(sameEndsArray, 2);
        int[] tripleUpArray = {1, 2, 4, 5, 7, 6, 5, 6, 7, 6};
        TripleUp tripleUp = new TripleUp(tripleUpArray);
        FizzArray3 fizzArray3 = new FizzArray3(5, 10);
        int[] shiftLeftArray = {6, 2, 5, 3};
        ShiftLeft shiftLeft = new ShiftLeft(shiftLeftArray);
        int[] tenRunArray = {2, 10, 3, 4, 20, 5};
        TenRun tenRun = new TenRun(tenRunArray);
        int[] pre4Array = {1, 2, 4, 1};
        Pre4 pre4 = new Pre4(pre4Array);
        int[] post4Array = {4, 4, 1, 2, 3};
        Post4 post4 = new Post4(post4Array);
        int[] notAloneArray = {1, 1, 1};
        NotAlone notAlone = new NotAlone(notAloneArray, 1);
        int[] zeroFrontArray = {1, 0, 0, 1};
        ZeroFront zeroFront = new ZeroFront(zeroFrontArray);
        int[] withoutTenArray = {10, 13, 10, 14, 10};
        WithoutTen withoutTen = new WithoutTen(withoutTenArray);
        int[] zeroMaxArray = {0, 5, 0, 3};
        ZeroMax zeroMax = new ZeroMax(zeroMaxArray);
        int[] evenOddArray = {1, 0, 1, 0, 0, 1, 1};
        EvenOdd evenOdd = new EvenOdd(evenOddArray);
        FizzBuzz fizzBuzz = new FizzBuzz(1, 6);
    }
}
