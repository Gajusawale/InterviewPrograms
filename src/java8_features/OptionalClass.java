package java8_features;

import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {

//        using of method Creating an optional with a non-null value

        Optional<String> optional1=Optional.of("Gajanan");
        System.out.println(optional1.get());

        optional1.orElseThrow();


    }
}
