package day03.interfaceEx.ex03;

public class Main {
    public static void main(String[] args) {
        ABCImpl abcImpl = new ABCImpl();

        InterfaceA ia = abcImpl;
        ia.methodA();
        System.out.println();

        InterfaceB ib = abcImpl;
        ib.methodB();
        System.out.println();

        InterfaceC ic = abcImpl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
        System.out.println();
    }
}
/*
 자식 인터페이스를 구현한 클래스는 자식 인터페이스의 메서드뿐만 아니라 부모 인터페이스의 모든
 부모 인터페이스 추상메서드를 재정의 해야 하며, 구현 객체는 자식 및 부모 인터페이스 변수에 대입 될 수 있다.

 구현 객체가 자식 인터페이스 변수에 대입되면, 자식 및 부모 인터페이스의 추상 메서드를 모두 호출 가능
 부모 인터페이스 변수에 대입되면 부모 인터페이스에 선언된 추상 메서드만 호출이 가능하다.
 */