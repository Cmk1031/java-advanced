package day07.collection.listEx.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        Student 철수 = new Student(250123, "김철수");
        Student 철남 = new Student(250123, "조철남");
        Student 영희 = new Student(240867, "최영희");

        List<Student> list = new ArrayList<>();
        list.add(철수);
        list.add(철남);
        list.add(영희);
        Collections.sort(list);
        list.forEach(System.out::println);

        /*int isBig = 철수.compareTo(철남);
        System.out.println(isBig);*/
    }
}
