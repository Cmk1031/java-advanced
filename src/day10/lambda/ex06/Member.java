package day10.lambda.ex06;

public class Member {
    private String id;
    private String name;

    public Member(){}

    public Member(String id) {
        this.id = id;
    }

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
