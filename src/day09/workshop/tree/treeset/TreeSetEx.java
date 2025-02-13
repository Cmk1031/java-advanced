package day09.workshop.tree.treeset;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(91);
        scores.add(87);
        scores.add(89);
        scores.add(88);
        scores.add(90);

        for (Integer score : scores) {
            System.out.println(score);
        }



    }
}
