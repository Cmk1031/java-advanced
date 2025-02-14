package day10.lambda.ex01;

public class ButtonEx {
    public static void main(String[] args) {
        Button button = new Button();

        //버튼을 누르면 "버튼이 클릭되었습니다."

        button.setClickListener(() -> System.out.println("버튼 클릭"));

        button.click();

        //button.click(); -> 버튼이 클릭되었습니다가 수행!

        Button cancelButton = new Button();
        cancelButton.setClickListener(() -> System.out.println("취소 버튼 클릭"));
        cancelButton.click();

    }
}
