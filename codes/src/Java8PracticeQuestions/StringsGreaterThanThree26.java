/*Problem:
Filter out strings with more than 3 characters from a list.
Input:["a", "abc", "abcd", "xyz"]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;

public class StringsGreaterThanThree26 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("a", "abc", "abcd", "xyz");

        List<String> ans = words.stream()
                .filter(s -> s.length() > 3)
                .toList();

        System.out.println(ans);
    }
}

/*
Explanation:
● filter(s -> s.length() > 3) filters out strings with more than 3 characters.*/