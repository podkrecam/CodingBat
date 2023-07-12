package Logic1;

public class FizzString {
    private String str;

    public FizzString(String str) {
        this.str = str;
        System.out.println("FizzString: " + make());
    }

    private String make() {
        String temp = str;
        if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
            temp = "FizzBuzz";
        } else if (str.charAt(0) == 'f') {
            temp = "Fizz";
        } else if (str.charAt(str.length() - 1) == 'b') {
            temp = "Buzz";
        }
        return temp;
    }
}
