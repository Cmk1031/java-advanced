package day07.genericEx.ex03;

public class Utility {
    //printArray 메서드는 제네릭 덕분에 어떤 타입의 배열도 수용할 수 있는 유연한 메서드!
    public static <T> void printArray(T[] array) {
        for(T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        String[] strArray = {"Hello", "Java"};
        Utility.printArray(strArray);
        Integer[] integers = {1,2,3,4,5};
        Utility.printArray(integers);
    }
}
