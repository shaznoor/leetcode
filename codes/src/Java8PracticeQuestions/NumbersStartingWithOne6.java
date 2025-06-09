/*Problem:
Given an array of integers, find all elements that start with 1.
Input:[10, 12, 35, 47, 15]*/

package Java8PracticeQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartingWithOne6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 12, 35, 47, 15);

        List<Integer> result = numbers.stream()
                .filter(val -> String.valueOf(val).startsWith("1"))
                .toList();

        /*List<String> list = numbers.stream().map(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .toList();*/

        System.out.println(result);
        //System.out.println(list);
    }
}

/*
Explanation:
● String.valueOf(n).startsWith("1") converts the integer to a string and checks if it starts with "1"*/
