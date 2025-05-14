/*Problem:
Reverse a list of strings using Java 8 Stream API.
Input:["apple", "banana", "pear"]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseListExample20 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pear");

        Collections.reverse(words);

        System.out.println(words);
    }
}

/*
Explanation:
● Collections.reverse(words) reverses the order of the elements in the list in place.*/