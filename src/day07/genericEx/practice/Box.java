package day07.genericEx.practice;

//어떤 타입의 객체든 저장할 수 있는 제네릭 클래스 Box를 구현하세요
//객체를 설정하고 가져오는 메서드를 구현하세요
public class Box<T> {
    private T name;
    private T size;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getSize() {
        return size;
    }

    public void setSize(T size) {
        this.size = size;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setName("골판지");
        stringBox.setSize("대");
        System.out.println("이름: " + stringBox.getName() + "사이즈: " + stringBox.getSize());
    }
}
