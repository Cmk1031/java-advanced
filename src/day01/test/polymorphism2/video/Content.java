package day01.test.polymorphism2.video;

public abstract class Content {
    private String title;
    private int price;

    public Content() {
    }

    public Content(String title) {
        this.title = title;
    }

    abstract void totalPrice();


    public void setPrice(int price) {
        this.price = price;
    }

    public void show() {
        System.out.println(title+" 비디오의 가격은 "+ price+"원 입니다.");
    }
}
