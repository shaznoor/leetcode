/*Problem:
Group a list of strings based on their length
Input:["apple", "banana", "pear", "kiwi"]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength14 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pear", "kiwi");

        Map<Integer, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(grouped);
    }
}

/*
Explanation:
● groupingBy(String::length) groups the strings by the number of characters they contain.*/