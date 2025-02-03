package day01.tv;

public class TVMain {
    public static void main(String[] args) {
        //동일한 클래스 타입의 참조 변수를 생성해서 초기화
        TV tv_controller1 = new TV();
        TV tv_controller2 = new SmartTV();
        SmartTV smart_controller = new SmartTV();

        SmartTV s = (SmartTV) tv_controller1;
        s.Shopping();

    }
}
