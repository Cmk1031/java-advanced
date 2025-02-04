package day02.exception01;

public class Exception01 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        try {
            Class.forName("java.lang.String3");
            Class.forName("java.lang.String1");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }


    public static void printLength(String data) {

        int result = 0;
        try {
            result = data.length();
        } catch (Exception e) {
           /* System.out.println(e.getMessage());
            System.out.println(e.toString());*/
            e.printStackTrace();
        } finally {
            System.out.println("마무리");
        }


        System.out.println("문자의 수: " + result);
    }
}
