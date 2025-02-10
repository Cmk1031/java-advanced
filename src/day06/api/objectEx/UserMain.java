package day06.api.objectEx;

import java.util.Arrays;

public class UserMain {
    public static void main(String[] args) {
        /*//얕은 복사(주소값 복사)
        User user = new User();
        user.setName("Shin");
        User copyUser = user;
        System.out.println(user.hashCode());
        System.out.println(copyUser.hashCode());
        System.out.println(user.equals(copyUser));

        //깊은 복사(deep copy)
        User user1 = new User();
        user1.setName("Shin");
        try {
            User copyUser1 = (User)user1.clone();
            System.out.println(user1.hashCode());
            System.out.println(copyUser1.hashCode());
            System.out.println(user1.equals(copyUser1));

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }*/

        User[] arrayObj = {new User(100,"park"), new User(101, "kim"), new User(102, "kang")};
        System.out.println(Arrays.toString(arrayObj));

        User[] arrayObj1;
        arrayObj1 = arrayObj.clone();
        System.out.println(Arrays.toString(arrayObj1));

        System.out.println(arrayObj[0].getId());
        arrayObj1[0].setId(999);
        System.out.println(arrayObj[0].getId());

    }
}
