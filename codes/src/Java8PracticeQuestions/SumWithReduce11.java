/*Problem:
Calculate the sum of all integers in a list using the reduce() method.
Input:[1, 2, 3, 4, 5]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;

public class SumWithReduce11 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        //int ans = numbers.stream().mapToInt(Integer::intValue).sum();
        //.orElse(-1);

        System.out.println(sum);
    }
}

/*Explanation:
● reduce(0, Integer::sum) sums all elements in the stream, starting from 0.*/