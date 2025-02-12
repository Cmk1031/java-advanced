package day07.collection.listEx.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product("갤럭시S25", 1200000);
        Product p2 = new Product("아이폰15Pro", 1_370_000);
        Product p3 = new Product("LG폰", 1_000_000);
        Product p4 = new Product("갤럭시S25(중고)", 1000000);
        Product p5 = new Product("아이폰15Pro(중고)", 1000000);
        Product p6 = new Product("LG폰(중고)", 10000);

        List<Product> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        System.out.println("List 정렬 전");
        list.forEach(System.out::println);

        System.out.println("List 정렬 후");
        Collections.sort(list);
        list.forEach(System.out::println);
    }

}
