package day05.innerClass.ex06.javabeans;

public class HamburgerLotteria {
    public static void main(String[] args) {
        Hamburger a = new Hamburger();
        a.setBun(2);
        a.setPatty(3);
        a.setCheese(2);
        Hamburger b = new Hamburger();
        Hamburger c = new Hamburger();
        System.out.println(a);
        //인스턴스 필드가 많으면 생성자가 많아져!!!
        /*
            생성자 만으로는 필드를 선택적으로 생략할 수 없는 방식
            타입이 다양할수록 생성자 메서드 수가 늘어나기 때문에 가독성이나 유지보수 측면에서 좋지 않다.

            기본 생성자 오버로딩에서 보였던 가독성 문제가 해결되고, 파라미터에 대해 해당되는 Setter 메서드를
            호출하면서 유연하게 객체 생성이 가능해짐

            문제점 발생
            1. 일관성 문제(consistency)
            필수 매개변수가 선택적으로 셋팅될 수 있으므로 일관성 문제가 발생한다.
            필수 멤버: 객체가 초기화 될 때, 반드시 설정이 되어야 하는 값
            객체가 유효하지 않은 형태로 생성, 햄버거 인스턴스를 다른 곳에서 사용하게 되면 런타임 예외가 발생할 수 있다.
            객체를 생성하는 부분과 값을 설정하는 부분이 물리적으로 떨어져 있어서 발생하는 문제점이다.

            2. 불변성 문제(immutable)
            자바빈즈 패턴의 Setter 메서드는 객체를 처음 생성할 때 필드값을 설정하기 위해 존재하는 메서드이다.
         */
    }
}
