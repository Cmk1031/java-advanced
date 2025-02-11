package day06.api.reflectionEx;

import java.lang.reflect.*;

public class Person {

    public String name;
    private int age;
    public static int weight = 50;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getField() {
        System.out.println("이름: "+ name + "나이: "+ age);
    }

    public int total(int left, int right) {
        return  left + right;
    }

    public static int staticTotal(int left, int right) {
        return left + right;
    }

    private int privateTotal(int left, int right) {
        return left + right;
    }



}
