/*Problem:
Find the largest number in a list of integers.
Input:[3, 5, 7, 2, 8]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxElement12 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 7, 2, 8);

        //Optional<Integer> largest1 = numbers.stream().max(Integer::compareTo);
        Optional<Integer> largest2 = numbers.stream().max(Integer::compare);

        //int largest = numbers.stream().mapToInt(Integer::intValue).max().orElse(-1);

        //System.out.println(largest1.orElse(null));
        System.out.println(largest2.orElse(null));
    }
}

/*
Explanation:
● max(Integer::compareTo) finds the maximum element by comparing each element with the next*/