package Streams;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        IntStream.iterate((int) 'A', i -> i <= (int) 'z', i -> i + 1)
                .filter(Character::isAlphabetic)
                .map(Character::toUpperCase)
                .distinct()
                //.filter(value -> Character.isAlphabetic(value))
                //.skip(5)
                //.filter(i->Character.toUpperCase(i)>'E')
                .forEach(d -> System.out.printf("%c ", d));

        System.out.println("\n---------------------------");
        Random random = new Random();
        Stream.generate(() -> random.nextInt((int) 'A', 'Z'+1))
                .limit(50)
                .distinct()
                .sorted()
                .forEach(d -> System.out.printf("%c ", d));
    }
}
