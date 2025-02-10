package day06.api.objectEx;

import java.util.Objects;

public class Member extends Object {
    String id;
    String name;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Member member = (Member) object;
        return Objects.equals(id, member.id) && Objects.equals(name, member.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

}
