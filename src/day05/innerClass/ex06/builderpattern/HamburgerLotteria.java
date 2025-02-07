package day05.innerClass.ex06.builderpattern;

public class HamburgerLotteria {
    public static void main(String[] args) {
        Hamburger 선민 = new Hamburger.BurgerBuilder("플랫", "쇠고기")
                .addCheese()
                .addBacon()
                .addTomato()
                .addLettuce()
                .build();
        System.out.println(선민);

        Hamburger 강사님 = new Hamburger.BurgerBuilder("플랫", "치킨", "콜라")
                .addCheese()
                .addLettuce()
                .addBacon()
                .build();
        System.out.println(강사님);
    }
}
/*
    실습: 필수 사항에 셋트는 반드시 음료가 포함되는 햄버거 세트
    음료가 포함되어 있는 햄버거를 만들어주세요
    치킨버거(토핑: 치즈, 야채, 베이컨) + 콜라  셋트 메뉴 만들어 주세요
 */