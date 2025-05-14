/*Problem:
Given a string, count the frequency of each character.
Input: "programming"*/

package Java8PracticeQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency1 {
    public static void main(String[] args) {
        String input = "programming";
        Map<Character, Long> frequencyMap =
                input.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequencyMap.forEach((character, count) -> System.out.println(character + ": " + count));
    }
}

/*
Explanation:
● input.chars() converts the string into a stream of integer representations of
characters.
● mapToObj(c -> (char) c) converts each integer back to a character.
● groupingBy(Function.identity(), Collectors.counting()) groups the
characters and counts their occurrences.
● Finally, we print each character and its frequency.*/
