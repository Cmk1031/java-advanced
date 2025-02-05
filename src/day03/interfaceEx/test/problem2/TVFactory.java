package day03.interfaceEx.test.problem2;

public class TVFactory extends Factory implements IWorkingTogether {

    public TVFactory(String name, int openHour, int closeHour) {
        super(openHour, closeHour, name);
    }

    // 파트너 공장의 기술력 'C'에 대한 하루 생산량을 리턴한다.
    @Override
    public int workTogether(IWorkingTogether partner) {
        return 3*getWorkingTime();
    }

    @Override
    int makeProducts(char skill) {
        if(skill=='A') return 8*getWorkingTime();
        else if(skill=='B') return 5*getWorkingTime();
        else if(skill=='C') return 3*getWorkingTime();
        else return getWorkingTime();
    }
}
