package day10.lambda.ex02;

/*
    Person 클래스는 Workable을 매개변수로 갖는 action 메서드와
    speakable을 매개변수로 갖는 action2()를 갖고 있다.
 */

public class Person {
    private String name;
    private String job;
    private String contents;
    private String music;

    public Person(String name, String job, String contents, String music) {
        this.name = name;
        this.job = job;
        this.contents = contents;
        this.music = music;
    }

    public void action(Workable workable) {
        workable.work(name, job);
    }

    public void action2(Speakable speakable) {
        speakable.speak(contents);
    }

    public void action3(Speakable speakable) {
        speakable.speak(music);
    }

    public void action4(Singable singable) {
        singable.sing(music);
    }




    /*
        홍길동씨가 프로그래밍을 합니다. 출력
        홍길동씨가 "프로그래밍은 정말 재미있어" 말합니다. 출력
     */

}
