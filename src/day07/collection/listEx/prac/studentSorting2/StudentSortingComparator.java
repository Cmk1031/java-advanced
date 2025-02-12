package day07.collection.listEx.prac.studentSorting2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private int sno;
    private List<Integer> subjects;
    private int total;
    private double avg;

    public int getTotal() {
        return total;
    }

    public int getSno() {
        return sno;
    }

    public Student(String name, int sno, List<Integer> subjects) {
        this.name = name;
        this.sno = sno;
        this.subjects = subjects;
        this.total = getTotal(subjects);
        this.avg = getAvg(total);
    }



    private int getTotal(List<Integer> subjects) {
        int sum = 0;
        for (Integer subjectScore : subjects) {
            sum += subjectScore;
        }
        return sum;
    }

    private double getAvg(int total) {
        return (double) total / subjects.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sno=" + sno +
                ", subjects=" + subjects +
                ", total=" + total +
                ", avg=" + avg +
                '}';
    }
}

public class StudentSortingComparator {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("문규", 10000, Arrays.asList(10, 10, 10)));
        studentList.add(new Student("병곤", 10001, Arrays.asList(10, 10, 10)));
        studentList.add(new Student("민성", 10002, Arrays.asList(30, 40, 50)));
        studentList.add(new Student("민혁", 10003, Arrays.asList(10, 20, 30)));
        studentList.add(new Student("정섭", 10004, Arrays.asList(50, 60, 70)));
        Collections.sort(studentList, Comparator.comparing(Student::getTotal).reversed().thenComparing(Student::getSno));
        studentList.forEach(System.out::println);
    }
}
