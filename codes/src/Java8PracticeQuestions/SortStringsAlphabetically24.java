/*Problem:
Sort a list of strings in alphabetical order.
Input:["apple", "banana", "pear"]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;

public class SortStringsAlphabetically24 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("pear", "banana", "apple");

        List<String> result = words.stream()
                .sorted()
                .toList();

        System.out.println(result);
    }
}
