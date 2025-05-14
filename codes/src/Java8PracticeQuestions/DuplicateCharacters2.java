/*Problem:
Given a string, find all the characters that appear more than once.
Input:"programming"*/

package Java8PracticeQuestions;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacters2 {
    public static void main(String[] args) {
        String input = "programming";
        List<Character> duplicate =
                input.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet().stream()
                        .filter(entry -> entry.getValue() > 1)
                        .map(Map.Entry::getKey)
                        .toList();

        duplicate.forEach(System.out::println);
    }
}

/*
Explanation:
● We use groupingBy() to count occurrences of each character.
● filter(entry -> entry.getValue() > 1) filters out characters that appear more than once.
● The duplicates are collected into a Set to ensure uniqueness, and then printed.*/
