package Warmup1;

public class Or35 {
    private int num;

    public Or35(int num) {
        this.num = num;
        System.out.println(dividedBy3Or5());
    }

    private boolean dividedBy3Or5() {
        return (num % 3 == 0) || (num % 5 == 0);
    }
}
