/*Problem:
Find the second-highest number in an array.
Input:[5, 8, 12, 7, 3, 10]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.OptionalInt;

public class SecondHighestNumber4 {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 12, 7, 3, 10};

        int secondHighest = Arrays.stream(numbers)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(-1);

        /*Why It's Needed Here - .boxed()
        Arrays.stream(int[]) returns an IntStream (primitive stream)
        Comparator.reverseOrder() only works with objects (Integer, not int)
        .boxed() bridges this gap by converting to Stream<Integer>

        Alternatives to .boxed()
        Using mapToObj():
        .mapToObj(Integer::valueOf)*/

        /*System.out.println(secondHighest);

        OptionalInt secondHighest = Arrays.stream(numbers)
                .distinct()
                .sorted()
                .skip(numbers.length - 2)
                .findFirst();
        System.out.println("Second highest number: " +
                secondHighest.getAsInt());*/
    }
}

/*
Explanation:
● distinct() removes duplicate values.
● sorted() sorts the numbers in ascending order.
● skip(numbers.length - 2) skips the elements until the second-highest value, and findFirst() retrieves it.*/
