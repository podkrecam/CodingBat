package Array1;

public class MainArray1 {
    public static void main(String[] args) {
        int[] arrayFirstLast6 = {13, 6, 1, 2, 6};
        FirstLast6 firstLast6 = new FirstLast6(arrayFirstLast6);
        int[] arraySameFirstLast = {1, 2, 3, 4};
        SameFirstLast sameFirstLast = new SameFirstLast(arraySameFirstLast);
        MakePi makePi = new MakePi();
        int[] array1 = {1, 2, 3};
        int[] array2 = {7, 3, 2};
        CommonEnd commonEnd = new CommonEnd(array1, array2);
        int[] arraySum3 = {5, 11, 2};
        Sum3 sum3 = new Sum3(arraySum3);
        RotateLeft3 rotateLeft3 = new RotateLeft3(arraySum3);
        Reverse3 reverse3 = new Reverse3(array1);
        MaxEnd3 maxEnd3 = new MaxEnd3(arraySameFirstLast);
        Sum2 sum2 = new Sum2(arrayFirstLast6);
        MiddleWay middleWay = new MiddleWay(array1, array2);
        MakeEnds makeEnds = new MakeEnds(arrayFirstLast6);
        Has23 has23 = new Has23(arrayFirstLast6);
        No23 no23 = new No23(arrayFirstLast6);
        int[] makeLastArray = {4, 5, 6};
        MakeLast makeLast = new MakeLast(makeLastArray);
        int[] double23Array = {2, 3};
        Double23 double23 = new Double23(double23Array);
        int[] fix23Array = {2, 3, 5};
        Fix23 fix23 = new Fix23(fix23Array);
        int[] start1A = {1, 2};
        int[] start1B = {1, 5};
        Start1 start1 = new Start1(start1A, start1B);
        BiggerTwo biggerTwo = new BiggerTwo(start1A, start1B);
        int[] makeMiddleArray = {7, 1, 2, 3, 4, 9};
        MakeMiddle makeMiddle = new MakeMiddle(makeMiddleArray);
        PlusTwo plusTwo = new PlusTwo(start1A, start1B);
        SwapEnds swapEnds = new SwapEnds(makeMiddleArray);
        MidThree midThree = new MidThree(arrayFirstLast6);
        MaxTriple maxTriple = new MaxTriple(makeMiddleArray);
        FrontPiece frontPiece = new FrontPiece(makeMiddleArray);
        int[] unluckyArray = {1, 2, 3, 4, 1, 3};
        Unlucky1 unlucky1 = new Unlucky1(unluckyArray);
        int[] make2A = {5, 4};
        int[] make2B = {2, 3, 7};
        Make2 make2 = new Make2(make2A, make2B);
        Front11 front11 = new Front11(make2A, make2B);
    }
}
