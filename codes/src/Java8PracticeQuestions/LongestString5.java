/*Problem:
Find the longest string from an array of strings.
Input : ["apple", "banana", "strawberry", "kiwi"]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.Comparator;

public class LongestString5 {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "strawberry", "kiwi"};

        String longest = Arrays.stream(words)
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        System.out.println(longest);
    }
}

/*
Explanation:
● max(Comparator.comparingInt(String::length)) finds the string with the maximum length.
● If no string is found, orElse(null) returns null.*/
