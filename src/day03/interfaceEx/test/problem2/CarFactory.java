package day03.interfaceEx.test.problem2;

public class CarFactory extends Factory implements IWorkingTogether {
    public CarFactory( String name, int openHour, int closeHour) {
        super(openHour, closeHour, name);
    }

    @Override
    int makeProducts(char skill) {
        if(skill=='A') return 3*getWorkingTime();
        else if(skill=='B') return 2*getWorkingTime();
        else if(skill=='C') return getWorkingTime();
        else return 0;
    }

    //파트너 공장의 기술력 'B'에 대한 하루 생산량을 리턴한다.
    @Override
    public int workTogether(IWorkingTogether partner) {
        return 2*getWorkingTime();
    }
}
