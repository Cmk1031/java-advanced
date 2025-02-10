package day06.api.objectEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class MemberMain {
    public static void main(String[] args) {
        Member m1 = new Member("ssg1");
        Member m2 = new Member("ssg1");
        Member m3 = new Member("ssg3");

        if(m1.equals(m2)) {
            System.out.println("동일 회원 O");
        } else {
            System.out.println("동일 회원 X");
        }

        //Computer
        System.out.println(m1==m2); //주소 비교 false
        System.out.println(m1.equals(m2)); //Object equals() 주소값을 비교하기 때문에 false

        //사용자 관점
        System.out.println(m1==m2);
        System.out.println(m1.equals(m2));

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());

        List<Member> members = new ArrayList<>();
        members.add(m1);
        members.add(m2);
        System.out.println(members.size());

        Set<Member> members1 = new HashSet<>();
        members1.add(m1);
        members1.add(m2);
        System.out.println(members1.size());
        //Collection(HashMap, HashSet, HashTable)은 객체가 논리적으로 같은지를 비교할때!

    }
}
