package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSources {
    public static void main(String[] args) {
        String[] strings = {"One", "Two", "Three"};

        Stream<String> firstStream = Arrays.stream(strings)
                .sorted(Collections.reverseOrder());
        //.forEach(System.out::println);

        Stream<String> secondStream = Stream.of("Six", "Five", "Four")
                .map(String::toUpperCase);
        //.forEach(System.out::println);

        Stream.concat(secondStream, firstStream)
                .map(s -> s.charAt(0) + "-" + s)
                .forEach(System.out::println);

        Map<Character, int[]> myMap = new LinkedHashMap<>();
        int bingoIndex = 1;
        for (char c : "BINGO".toCharArray()) {
            int[] numbers = new int[15];
            int finalBingoIndex = bingoIndex;
            Arrays.setAll(numbers, i -> i + finalBingoIndex);
            myMap.put(c, numbers);
            bingoIndex += 15;
        }
        myMap.entrySet().stream()
                .map(e -> e.getKey() + " has range: " + e.getValue()[0] + "-" +
                        e.getValue()[e.getValue().length - 1])
                .forEach(System.out::println);

        myMap.forEach((key, value) -> {
            System.out.print(key + ": ");
            Arrays.stream(value).forEach(num -> System.out.print(num + " "));
            System.out.println();
        });

        Random random = new Random();
        Stream.generate(() -> random.nextInt(2))
                .limit(10)
                .forEach(s -> System.out.print(s + " "));

        System.out.println("\n-------------------------------");

        IntStream.iterate(1, n -> n + 1)
                .limit(20)
                .forEach(s -> System.out.print(s + " "));
    }
}
