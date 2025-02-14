package day10.lambda.ex02;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("황가람", "가수", "만나서 반갑소", "반딧불");
        person.action((name, job)-> System.out.println(name+"은 "+ job+"입니다."));
        person.action2((x) -> System.out.println(x+" 말합니다."));
        person.action3((music) -> System.out.println(music+" 노래를 부른다."));

        System.out.println();

        Person person1 = new Person("조수미", "오페라가수", "감사하오", "밤의 아리아");
        person1.action((name, job)-> System.out.println(name+"는 "+ job+"입니다."));
        person1.action2((x) -> System.out.println(x+" 말합니다."));
        person1.action3((music) -> System.out.println(music+" 노래를 부른다."));
        person1.action4((music) -> System.out.println(music));



        /*
            황가람은 가수입니다.
            만나서 반갑소 출력
            반딧불 노래를 부릅니다. //노래 부르는 action 추가
         */
    }
}
