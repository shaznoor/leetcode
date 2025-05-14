/*Problem:
Skip the first 2 elements in a list and limit the result to the next 3 elements.
Input:[1, 2, 3, 4, 5, 6, 7, 8]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;

public class SkipAndLimitExample8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> result = numbers.stream()
                .skip(2)
                .limit(3)
                .toList();

        System.out.println(result);
    }
}

/*
Explanation:
● skip(2) skips the first 2 elements, and limit(3) limits the stream to the next 3 elements.*/