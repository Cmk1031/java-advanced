package day07.lamdaEx;
//Pair 클래스는 두개의 타입 매개변수 T와 U를 가진 제네릭 클래스이다.
//서로 다른 타입의 두 객체를 가질 수 있다.
public class Pair <T, U>{
    private T first;
    private U second;

    public Pair(){}

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}
