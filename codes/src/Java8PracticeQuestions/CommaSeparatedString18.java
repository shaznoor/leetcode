/*Problem:
Convert a list of integers into a single string where each element is separated by a comma.
Input:[1, 2, 3, 4]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommaSeparatedString18 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        String ans = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(ans);
    }
}

/*Explanation:
● map(String::valueOf) converts each integer to a string.
● Collectors.joining(", ") joins the strings with a comma separator.*/