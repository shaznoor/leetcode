/*Problem:
Find any element in a list that is divisible by 5.
Input:[1, 2, 3, 10, 7, 5]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;

public class FindAnyExample19 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 10, 7, 5);

        int ans = numbers.stream()
                .filter(n -> n % 5 == 0)
                .findAny()
                .orElse(-1);

        System.out.println(ans);
    }
}

/*
Explanation:
● filter(n -> n % 5 == 0) filters numbers divisible by 5.
● findAny() finds any number from the filtered stream.*/