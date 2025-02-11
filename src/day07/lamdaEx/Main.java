package day07.lamdaEx;

public class Main {
    public static void main(String[] args) {
        Transformer<Integer, String> intToString = (input -> "Number: " + input);
        String result = intToString.transform(10);
        System.out.println(result.toString());

        Transformer<String, Integer> stringToLength = (String input) -> input.length();
        Integer length = stringToLength.transform("Hello Java Programming");
        System.out.println(length);


    }
}
