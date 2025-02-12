package day08.collection.set;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
//@EqualsAndHashCode
public class Member {
    public String name;
    public int age;


    @Override
    public boolean equals(Object o) {
        //name과 age가 같다면 true 리턴
        if(o instanceof Member target) {
            return target.name.equals(name) && (target.age==age);
        } return false;
    }

    @Override
    public int hashCode() {
        //name과 age 값이 같으면 동일한 hashCode가 리턴
        return name.hashCode() + age;
    }


}
