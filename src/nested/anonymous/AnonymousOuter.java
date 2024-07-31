package nested.anonymous;

import nested.local.LocalOuterV2;
import nested.local.Printer;

/**
 * 정리
 * 익명 클래스는 이름이 없는 지역 클래스
 * 특정 부모 클래스(인터페이스)를 상속 받고 바로 생성하는 경우 사용
 * 지역 클래스가 일회성으로 사용되는 경우나 간단한 구현을 제공할 때 사용
 */
public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        //Printer라는 이름의 인터페이스를 구현한 익명 클래스를 생성한 것
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.class = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
