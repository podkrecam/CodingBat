package String3;

public class WithoutString {
    /*
    Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

    withoutString("Hello there", "llo") → "He there"
    withoutString("Hello there", "e") → "Hllo thr"
    withoutString("Hello there", "x") → "Hello there"
     */
    private String base;
    private String remove;

    public WithoutString(String base, String remove) {
        this.base = base;
        this.remove = remove;
        System.out.println("WithoutString: " + create());
    }

    private String create() {
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < base.length(); i++) {
            if (i <= base.length() - remove.length() && base.substring(i, i + remove.length()).equalsIgnoreCase(remove)) {
                i += remove.length() - 1;
            } else {
                temp.append(base.charAt(i));
            }
        }

        return temp.toString();
    }
}
