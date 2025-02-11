package day07.genericEx.practice;


import java.util.ArrayList;
import java.util.List;

//어떤 타입의 배열을 받아 요소를 출력하는 제네릭 메서드 printArray를 작성
public class GenericMethodEx {

    public static void printArray(List<?> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }

    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            integerList.add(i);
            stringList.add("안녕");
        }
        GenericMethodEx.printArray(integerList);
        GenericMethodEx.printArray(stringList);
    }
}
