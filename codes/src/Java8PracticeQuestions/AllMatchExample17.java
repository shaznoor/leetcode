/*Problem:
Check if all elements in a list are positive numbers.
Input:[1, 2, 3, -4, 5]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;

public class AllMatchExample17 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, -4, 5);

        boolean allPositive = numbers.stream().allMatch(n -> n > 0);

        System.out.println(allPositive);
    }
}

/*
Explanation:
● allMatch(n -> n > 0) checks if all elements satisfy the condition (being positive).*/