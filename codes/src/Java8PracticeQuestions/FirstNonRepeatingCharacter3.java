/*Problem:
Find the first character in the string that doesn't repeat.
Input:"swiss"*/

package Java8PracticeQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter3 {
    public static void main(String[] args) {
        String input = "racecars";
        Character ans = input.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry->entry.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(ans);
    }
}

/*Explanation:
● LinkedHashMap::new ensures that insertion order is maintained.
● We use groupingBy() to count character occurrences, then filter for the first character with a count of 1.*/
