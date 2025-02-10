package day06.api.lombokEx;

public class Main {
    public static void main(String[] args) {
        Member member = new Member();
        Member member1 = new Member("shin", "sssg", 24);
        System.out.println(member1.getId());


        Member member2 = Member.builder()
                .name("sds")
                .id("2")
                .age(1)
                .build();

        System.out.println(member2);
    }
}
