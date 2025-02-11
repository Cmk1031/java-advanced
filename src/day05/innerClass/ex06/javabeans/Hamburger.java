package day05.innerClass.ex06.javabeans;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/*
    Setter 메서드를 사용한 자바빈(Java Bean 패턴)으로 리팩토링
 */
@Data

@Getter
public class Hamburger {
    //필수 멤버
    private int bun;
    private int patty;

    //선택 멤버
    private int cheese;
    private int lettuce;
    private int tomato;
    private int bacon;

    public void setBun(int bun) {
        this.bun = bun;
    }

    public void setPatty(int patty) {
        this.patty = patty;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public void setLettuce(int lettuce) {
        this.lettuce = lettuce;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public void setBacon(int bacon) {
        this.bacon = bacon;
    }
}
