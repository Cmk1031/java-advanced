package day07.genericEx.ex03;

import java.util.List;

//Number 타입만 지원하는 제네릭 클래스
//Number를 확장하는 클래스만 NumberBox의 타입매개변수로 사용할 수 있다.
public class NumberBox <T extends Number>{
    private T number;

    public void setNumber(T number) {
        this.number = number;
    }

    public double doubleValue() {
        return number.doubleValue();
    }

    //상한 제한 와일드 카드 <? extends T>
    public void printNumberList(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }

    //어떤 타입 제한 없이 담을 수 있다.
    public void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    // 하한 제한 와일드 카드 (? super T) 특정 타입 또는 그 상위 클래스 중 하나를 허용
    public void addNumbers(List<? super Integer> list) {

    }
}
