package String1;

public class HelloName {
    private String name;

    public HelloName(String name) {
        this.name = name;
        System.out.println(hello());
    }

    private String hello() {
        return "Hello " + name + "!";
    }
}
