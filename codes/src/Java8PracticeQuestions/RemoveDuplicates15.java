/*Problem:
Remove all duplicates from a list of integers.
Input:[1, 2, 3, 2, 4, 1, 5]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates15 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5);

        List<Integer> result = numbers.stream()
                .distinct().toList();

        System.out.println(result);
    }
}

/*
Explanation:
● distinct() removes all duplicates from the stream.*/