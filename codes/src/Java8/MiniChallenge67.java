package Java8;

import java.util.function.Supplier;

public class MiniChallenge67 {
    public static void main(String[] args) {
        Supplier<String> iLoveJava = () -> {
            return "I Love Java";
        };
        System.out.println(iLoveJava.get());
    }
}
