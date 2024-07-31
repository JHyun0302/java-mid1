package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";

        /**
         * String은 참조값! 원칙적으로 + 연산이 불가능하다.
         * 하지만 문자열은 너무 자주 다루어지기 때문에 자바 언어에서 편의상 특별히 `+` 연산을 제공
         */
        String result1 = a.concat(b);
        String result2 = a + b;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
