package lang.string.Immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat("java");
        System.out.println("str = " + str); //불변 객체라서 concat 불가능
    }
}
