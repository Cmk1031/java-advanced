package day08.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        //객체 저장
        set.add("Java");
        set.add("Java");
        set.add("Programming");

        System.out.println(set.size());
    }
}
