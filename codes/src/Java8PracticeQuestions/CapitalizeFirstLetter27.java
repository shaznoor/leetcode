/*Problem:
Capitalize the first letter of each word in a list.
Input:["java", "stream", "api"]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;

public class CapitalizeFirstLetter27 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "api");

        List<String> ans = words.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .toList();

        System.out.println(ans);
    }
}

/*
Explanation:
● substring(0, 1).toUpperCase() capitalizes the first letter.
● substring(1) keeps the rest of the word intact.*/