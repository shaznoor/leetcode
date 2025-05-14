/*Problem:
Join an array of strings into a single string, separated by commas.
Input:["apple", "banana", "cherry"]*/

package Java8PracticeQuestions;

public class JoinStrings7 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "cherry"};
        String result = String.join(", ", fruits);
        System.out.println(result);
    }
}

/*
Explanation:
● String.join(", ", fruits) concatenates the strings with a comma separator.*/