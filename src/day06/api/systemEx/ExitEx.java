package day06.api.systemEx;

public class ExitEx {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            System.out.println(i+ " ");
            if(i==8) {
                System.out.println("프로세스 강제 종료");
                System.exit(0);
            }
        }
    }
}
