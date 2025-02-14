package day09.workshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
    수정할 수 없는 컬렉션
 */
public class Unmodifiable {
    public static void main(String[] args) {
        //수정할 수 없는 컬렉션 만드는 방법
        //1. of()
        /*List<String> immutableList1 = List.of("A", "B", "C");
        immutableList1.add("E");
        immutableList1.forEach(System.out::println);

        Set<String> immutableSet1 = Set.of("A", "B", "C");
        immutableSet1.remove("C");
        immutableSet1.forEach(System.out::println);

        Map<Integer, String> immutableMap1 = Map.of(1, "A", 2, "B", 3, "C");
        immutableMap1.put(4, "D");

        //List 컬렉션을 불변 컬렉션으로 복사
        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        List<String> immutableList2 = List.copyOf(list2);*/

        //배열로부터 List 불변 컬렉션으로 생성
        String[] array = {"A", "B", "C"};
        array[2] = "D";
        for (String s : array) {
            System.out.println(s+ " ");
        }

        List<String> immString3 = Arrays.asList(array);


    }
}
