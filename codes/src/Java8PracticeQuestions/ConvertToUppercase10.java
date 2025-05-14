/*Problem:
Convert all strings in a list to uppercase using the map() function.
Input:["java", "stream", "api"]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;

public class ConvertToUppercase10 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "api");

        List<String> result = words.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(result);
    }
}

/*
Explanation:
● map(String::toUpperCase) converts each string in the list to uppercase.
● The result is collected back into a list.*/