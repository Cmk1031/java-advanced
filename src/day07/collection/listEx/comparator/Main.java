package day07.collection.listEx.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//사용자(User) 이름과 나이로 5명(객체)를 생성하고 나이순으로 정렬 한 후 사용자의 이름과 나ㅏ이를 출력하시오
//ex) 홍길동 32세
//    임준오 48세
public class Main {
    public static void main(String[] args) {

        class User implements Comparable<User>{
            String name;
            int age;

            User(String name, int age){
                this.name = name;
                this.age = age;
            }

            @Override
            public int compareTo(User o) {
                return this.age - o.age;
            }

            @Override
            public String toString() {
                return "User{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }
        //List에 5명의 사용자 저장 후 정렬
        User 문규 = new User("최문규", 120);
        User 병곤 = new User("김병곤", 140);
        User 민성 = new User("서민성", 200);
        User 민혁 = new User("신민혁", 100);
        User 정섭 = new User("이정섭", 130);

        List<User> list = new ArrayList<>();
        list.add(문규);
        list.add(병곤);
        list.add(민성);
        list.add(민혁);
        list.add(정섭);
        Collections.sort(list);
        list.forEach(System.out::println);

        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                //return Integer.compare(o1.age, o2.age);
                return o1.name.compareTo(o2.name);
            }
        });

        Collections.sort(list, (u1,u2) -> u1.name.compareTo(u2.name));
        list.forEach(System.out::println);

    }
}