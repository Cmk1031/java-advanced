package day07.lamdaEx;

/*
    Transformer 제네릭 함수형 인터페이스 정의
 */

@FunctionalInterface
public interface Transformer<T, R> {
    R transform(T input);
}
