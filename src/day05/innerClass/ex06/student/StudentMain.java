package day05.innerClass.ex06.student;

import day05.innerClass.ex06.student.Student.StudentBuilder;

/*
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
*/
class Student {
    private String id;
    private String name;
    private String major;

    private String grade = "freshman";
    private String phoneNumber;
    private String address;

    public Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.id;
        this.name = studentBuilder.name;
        this.major = studentBuilder.major;
        this.grade = studentBuilder.grade;
        this.phoneNumber = studentBuilder.phoneNumber;
        this.address = studentBuilder.address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class StudentBuilder {
        private String id;
        private String name;
        private String major;

        private String grade = "freshman";
        private String phoneNumber;
        private String address;

        public StudentBuilder(String id, String name, String major) {
            this.id = id;
            this.name = name;
            this.major = major;
        }

        public StudentBuilder grade(String grade) {
            this.grade = grade;
            return this;
        }
        public StudentBuilder phoneNumber(String phoneNumber) {
            this.grade = grade;
            return this;
        }
        public StudentBuilder address(String address) {
            this.grade = grade;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

}

public class StudentMain {
    public static void main(String[] args) {
       /* Student student1 = Student.builder()
                .id("1")
                .name("최문규")
                .major("컴공")
                .grade("freshman")
                .phoneNumber("1")
                .address("1")
                .build();

        System.out.println(student1);*/

        Student student1 = new Student.StudentBuilder("1", "문규", "컴공")
                .phoneNumber("123")
                .build();
        System.out.println(student1);
    }
}
