package day01.test.polymorphism3;

public abstract class Wheeler {
    protected String carName;
    protected int velocity;
    protected int wheelNumber;


    abstract public void speedUp(int speed);

    abstract public void speedDown(int speed);

    abstract public void wheelNumber();

    public void stop(){
        velocity = 0;
        System.out.println("정지상태로 속도를 "+velocity+"으로 초기화합니다.");
    }
}
