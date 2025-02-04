package day02.exception02;

public class Exception02 {
    public static void main(String[] args) {
        String[] stringarray = {"100", "loo"};
        for (int i=0; i<stringarray.length; i++) {
            try {
                int value = Integer.parseInt(stringarray[i]);
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스 초과. "+ e.getMessage());
            } catch(NumberFormatException e) {
                System.out.println("숫자로 변환할 수 없는 데이터 " + e.getMessage());
            }
        }
    }
}
