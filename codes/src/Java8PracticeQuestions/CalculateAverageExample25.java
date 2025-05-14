/*Problem:
Calculate the average of a list of numbers using Java 8 streams.
Input:[4, 5, 7, 10]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;

public class CalculateAverageExample25 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 5, 7, 10);

        //double average = numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);

        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);

        System.out.println(average);
    }
}

/*
Explanation:
● mapToInt(Integer::intValue) converts the stream of numbers to an IntStream.
● average() calculates the average of the numbers.*/