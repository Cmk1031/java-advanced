package day07.genericEx.practice;
// 3. Comparable<T> 를 확장하는 타입의 두 객체를 비교하는 제네릭 메서드 compareTo를 작성 이 메서드를 이용하여 두 숫자를 비교하세요.
public class BoundedGenericMethod {

    public static <T extends Comparable<T>> T max(T a, T b) {
        return CompareTo(a,b);
    }

    private static <T extends Comparable<T>> T CompareTo(T a, T b) {
        if((Integer)a>(Integer)b) return a;
        return b;

    }


}
