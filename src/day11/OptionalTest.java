package day11;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> emptyOptional = Optional.empty();

        String result = emptyOptional.orElseThrow(() -> new IllegalArgumentException("값이 없습니다."));
     
    }
}
