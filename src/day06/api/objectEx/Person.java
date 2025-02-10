package day06.api.objectEx;

import lombok.Data;

/*
    데이터 전달을 위한 역할 : DTO(Data Transfer Object) 반복적으로 사용되는 코드를 줄이기 위해 도입
    정보의 단위 : record, row(행)
 */
@Data
public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

  /*  public String name() {return name;}
    public int age() {return age;}

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Person person = (Person) object;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }*/
}
