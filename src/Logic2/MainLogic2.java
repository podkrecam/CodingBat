package Logic2;

public class MainLogic2 {
    public static void main(String[] args) {
        MakeBricks makeBricks = new MakeBricks(20, 0, 19);
        LoneSum loneSum = new LoneSum(9, 2, 2);
        LuckySum luckySum = new LuckySum(1, 2, 13);
        NoTeenSum noTeenSum = new NoTeenSum(2, 13, 1);
        RoundSum roundSum = new RoundSum(16, 17, 4);
        CloseFar closeFar = new CloseFar(1, 2, 3);
        BlackJack blackJack = new BlackJack(19, 22);
        EvenlySpaced evenlySpaced = new EvenlySpaced(4, 6, 3);
        MakeChocolate makeChocolate = new MakeChocolate(1, 2, 7);
    }
}
