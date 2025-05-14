/*Problem:
Check if all strings in a list are in uppercase.
Input:["APPLE", "BANANA", "PEAR"]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;

public class AllUppercaseCheck29 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("APPLE", "BANANA", "PEAR");

        boolean ans = words.stream()
                .allMatch(s -> s.equals(s.toUpperCase()));

        System.out.println(ans);
    }
}

/*
Explanation:
● allMatch(word -> word.equals(word.toUpperCase())) checks if all strings are in uppercase.
● The method compares each string with its uppercase version.*/