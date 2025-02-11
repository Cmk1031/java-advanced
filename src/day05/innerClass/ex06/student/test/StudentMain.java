package day05.innerClass.ex06.student.test;

import lombok.Builder;
import lombok.Setter;

@Setter
@Builder
class Student {
    private String id;
    private String name;

    private String major;
    private String grade;
}

public class StudentMain {
    public static void main(String[] args) {
        Student student = Student.builder()
                .id("2")
                .build();

        System.out.println(student);
    }
}
