package day05.innerClass.ex01;

public class ABMain {
    public static void main(String[] args) {
        // 바깥 클래스인 A클래스 먼저 생성
        A a = new A();
        // B객체 생성
        A.B b = a.new B();
    }
}
