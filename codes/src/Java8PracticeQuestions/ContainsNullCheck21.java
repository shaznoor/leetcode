/*Problem:
Check if a list contains any null values using Java 8.
Input:["apple", null, "pear"]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ContainsNullCheck21 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", null, "pear");

        boolean ans = words.stream()
                .anyMatch(Objects::isNull);
        //boolean ans1 = words.contains(null);

        System.out.println(ans);
    }
}

/*
Explanation:
● anyMatch(word -> word == null) checks if any element in the stream is null*/