package day05.innerClass.ex03;

/*
캡슐화를 통해서 외부에서의 접근을 차단하면서, 내부 클래스에서 외부 클래스의 멤버들을
제약없이 쉽게 접근할 수 있도록 프로그래밍 함.
클래스 구조를 숨겨서 코드의 복잡도 줄임
 */

class Creature {
    private int life = 100;

    //private class, 오로지 Creature 외부에서만 접근 가능한 내부 클래스 생성
    private class Animal {
        private String name = "Tiger";

        //Creature의 private 멤버를 제약 없이 접근 가능
        int getOuter() {
            return life;
        }
    }

    public void method() {
        Animal animal = new Animal();

        //Getter 없이 내부 클래스의 private멤버 접근
        System.out.println(animal.name);
        //내부 클래스에서 외부 클래스 private 멤버 출력
        System.out.println(animal.getOuter());
    }
}

public class CreatureMain {
    public static void main(String[] args) {
        Creature creature = new Creature();
        creature.method();
    }
}
