package day07.collection.listEx.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//사용자(User) 이름과 나이로 5명(객체)를 생성하고 나이순으로 정렬 한 후 사용자의 이름과 나ㅏ이를 출력하시오
//ex) 홍길동 32세
//    임준오 48세
public class Main1 {
    public static void main(String[] args) {

        class User {
            private String name;
            private int age;

            User(String name, int age){
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
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

        Collections.sort(list, Comparator.comparing(User::getAge));//나이순 정렬
        for (User user : list) System.out.println(user.name + " " + user.age);

        System.out.println("====================");

        Collections.sort(list, Comparator.comparing(User::getName));//이름 정렬
        for (User user : list) System.out.println(user.name + " " + user.age);

        System.out.println("===================");

        Collections.sort(list, Comparator.comparing(User::getAge).thenComparing(User::getName));//이름 정렬
        for (User user : list) System.out.println(user.name + " " + user.age);


    }
}