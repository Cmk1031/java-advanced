package day03.interfaceEx.ex03.practice;

public class Main {
    public static void main(String[] args) {
        action(new B());
        action(new C());

    }

    private static void action(InterfaceA a) {
        if(a instanceof C c) c.method2();
        else a.method1();

    }
}
