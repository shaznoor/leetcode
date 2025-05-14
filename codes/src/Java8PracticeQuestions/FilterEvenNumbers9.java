/*Problem:
Given a list of integers, filter out the even numbers.
Input:[1, 2, 3, 4, 5, 6]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumbers9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> result = numbers.stream()
                .filter(val -> val % 2 != 0)
                .toList();

        System.out.println(result);
    }
}

/*
Explanation:
● filter(n -> n % 2 != 0) filters out all even numbers, leaving only odd numbers in the result*/