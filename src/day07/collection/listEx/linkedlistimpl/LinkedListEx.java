package day07.collection.listEx.linkedlistimpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        List<String> list2 = new LinkedList<>();

        long startTime;
        long endTime;

        //ArrayList 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();
        for(int i=0; i<10000; i++) {
            list1.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println(endTime-startTime);

        //Linked 컬렉션에 저장하는 시간 측정
        startTime = System.nanoTime();
        for(int i=0; i<10000; i++) {
            list2.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println(endTime-startTime);

    }
}
