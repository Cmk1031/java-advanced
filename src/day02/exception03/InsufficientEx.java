package day02.exception03;
//사용자 정의 예외 (일반 예외)
public class InsufficientEx extends Exception{
    public InsufficientEx() {}

    public InsufficientEx(String message) {
        super(message);
    }
}
