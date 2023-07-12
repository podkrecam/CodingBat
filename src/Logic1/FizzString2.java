package Logic1;

public class FizzString2 {
    private int n;

    public FizzString2(int n) {
        this.n = n;
        System.out.println("FizzStrin2: " + yell());
    }

    private String yell() {
        String temp = "";
        if (n % 15 == 0) {
            temp = "FizzBuzz!";
        } else if (n % 3 == 0) {
            temp = "Fizz!";
        } else if (n % 5 == 0) {
            temp = "Buzz!";
        } else {
            temp = n + "!";
        }
        return temp;
    }
}
