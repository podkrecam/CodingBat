package Logic2;

public class MainLogic2 {
    public static void main(String[] args) {
        MakeBricks makeBricks = new MakeBricks(20, 0, 19);
        LoneSum loneSum = new LoneSum(9, 2, 2);
        LuckySum luckySum = new LuckySum(1, 2, 13);
        NoTeenSum noTeenSum = new NoTeenSum(2, 13, 1);
        RoundSum roundSum = new RoundSum(16, 17, 4);
    }
}
