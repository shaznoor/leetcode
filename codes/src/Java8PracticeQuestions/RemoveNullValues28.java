/*Problem:
Remove all null values from a list of strings.
Input:["apple", null, "banana", null, "pear"]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveNullValues28 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", null, "banana", null, "pear");

        List<String> ans = words.stream()
                .filter(Objects::nonNull)
                //.filter(s -> s != null)
                .toList();

        System.out.println(ans);
    }
}

/*
Explanation:
● filter(word -> word != null) filters out all null values.*/