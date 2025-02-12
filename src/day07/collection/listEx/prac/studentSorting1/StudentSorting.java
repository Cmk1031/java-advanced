package day07.collection.listEx.prac.studentSorting1;

/*
    1. 학생 객체에 이름, 학번, [국어, 영어, 수학] -> 배열 or 리스트로 받기 / 과목 성적 입력 받고 총점과 평균을 구한다.

    2. 학생을 성적 기준을 세우고 해당 학생의 석차를 매겨 출력하는 프로그램을 작성

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private String name;
    private int sno;
    private List<Integer> subjects;
    private int total;
    private double avg;

    public Student(String name, int sno, List<Integer> subjects) {
        this.name = name;
        this.sno = sno;
        this.subjects = subjects;
        this.total = getTotal(subjects);
        this.avg = getAvg(total);

    }

    @Override
    public int compareTo(Student o) {
        //return this.getTotal(subjects) - o.getTotal(subjects);
        return o.total - this.total; //내림차순
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

public class StudentSorting {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("문규", 10000, Arrays.asList(10, 10, 10)));
        studentList.add(new Student("병곤", 10001, Arrays.asList(20, 30, 40)));
        studentList.add(new Student("민성", 10002, Arrays.asList(30, 40, 50)));
        studentList.add(new Student("민혁", 10003, Arrays.asList(10, 20, 30)));
        studentList.add(new Student("정섭", 10004, Arrays.asList(50, 60, 70)));
        Collections.sort(studentList);
        int grade = 1;
        for (Student student : studentList)
            System.out.println(student + " "+ grade++ +"등");



    }
}
