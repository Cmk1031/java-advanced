import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        //1. 테이터 입력
        Scanner in = new Scanner(System.in);
        System.out.println("first number input: ");
        int a = in.nextInt();

        System.out.println("second number input: ");
        int b = in.nextInt();

        //2. 데이터 처리, 3. 데이터 결과 저장

        int sum = 0;

        for (int i=a; i<=b; i++) {
            if(i%2==0) {
                sum+=i;
            }
        }
        System.out.println(sum);

        //4. 결과 출력
        System.out.println("sum = " + sum);

        System.out.println("첫 번째 프로그램입니다.");

    }
}
