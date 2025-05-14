/*Problem:
Partition a list of integers into two lists: one containing even numbers and the other containing odd numbers.
Input:[1, 2, 3, 4, 5, 6]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByEvenOdd13 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> even = partitioned.get(true);
        List<Integer> odd = partitioned.get(false);

        System.out.println(even);
        System.out.println(odd);
    }
}

/*
Explanation:
● partitioningBy(n -> n % 2 == 0) partitions the numbers based on whether they are even or odd.*/