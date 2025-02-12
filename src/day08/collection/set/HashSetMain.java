package day08.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {
        Set<Member> members = new HashSet<>();

        members.add(new Member("홍길동",30));
        members.add(new Member("홍길동",30));
        members.add(new Member("홍길동1",30));
        members.add(new Member("홍길동2",30));
        members.add(new Member("홍길동3",30));

        System.out.println(members.size());

        //객체를 반복자 Iterator를 이용하여 처리
        Iterator<Member> iterator = members.iterator();
        while(iterator.hasNext()) {
            //객체를 하나씩 꺼내오기
            Member member = iterator.next();
            System.out.println(member.name + " " + member.age);
            iterator.remove();
            int size = members.size();
            System.out.println(size);
        }


    }
}
