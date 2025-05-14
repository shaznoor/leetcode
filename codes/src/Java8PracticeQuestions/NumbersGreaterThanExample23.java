/*Problem:
Find all numbers greater than a given number (e.g., 5) from a list.
Input:[2, 3, 5, 7, 8]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;

public class NumbersGreaterThanExample23 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 8);

        List<Integer> result = numbers.stream()
                .filter(n -> n > 5)
                .toList();

        System.out.println(result);
    }
}

/*
Explanation:
● filter(n -> n > 5) filters out all numbers greater than 5.*/