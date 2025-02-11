package day07.lamdaEx;

import java.util.Arrays;
import java.util.List;

public class StreamEx {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("functional", "programming", "width", "generics", "in", "out");

        //함수이기에 원본은 건드리지 않는다.
        List<String> filteredWords = words.stream()
                .filter(word -> word.length() > 4)
                .map(word -> word.toUpperCase())
                .toList();
        System.out.println(filteredWords);
    }
}
