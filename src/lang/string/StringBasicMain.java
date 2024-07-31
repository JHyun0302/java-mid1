package lang.string;

/**
 * String은 클래스이다. 기본형이 아닌 참조형! 문자열은 매우 자주 사용된다. 그래서 편의상 쌍따옴표로 문자열을 감싸면 자바 언어에서 `new String("hello")` 와 같이 변경해준다.
 */
public class StringBasicMain {
    public static void main(String[] args) {
        String str1 = "hello"; //기존
        String str2 = new String("hello"); //변경

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
