/*Problem:
Find the second-smallest element in a list of integers.
Input:[5, 3, 8, 2, 9]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;

public class SecondSmallestElement22 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 9);

        int ans = numbers.stream()
                .sorted()
                .skip(1)
                .findAny().orElse(-1);

        System.out.println(ans);
    }
}

/*
Explanation:
● sorted() sorts the numbers in ascending order.
● skip(1) skips the first (smallest) element to find the second smallest.*/