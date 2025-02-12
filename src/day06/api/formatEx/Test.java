package day06.api.formatEx;

public class Test {
    public static void main(String[] args) {
        String txt1 = "111";
        String txt2 = "110";
        String txt3 = "101";
        String txt4 = "100";
        String txt5 = "10";
        String txt6 = "0";
        String txt7 = "3";
        String regx = "(^[0-9]$)|(^[1-9][0-9]$)|(^[1][0][0]$)";

        boolean result1 = txt1.matches(regx);
        boolean result2 = txt2.matches(regx);
        boolean result3 = txt3.matches(regx);
        boolean result4 = txt4.matches(regx);
        boolean result5 = txt5.matches(regx);
        boolean result6 = txt6.matches(regx);
        boolean result7 = txt7.matches(regx);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);


    }
}
