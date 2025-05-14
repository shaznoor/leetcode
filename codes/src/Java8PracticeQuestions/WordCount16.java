/*Problem:
Count the number of words in a given sentence.
Input:"Java 8 streams are powerful"*/

package Java8PracticeQuestions;

import java.util.Arrays;

public class WordCount16 {
    public static void main(String[] args) {
        String sentence = "Java 8 streams are powerful";

        long result = Arrays.stream(sentence.split(" ")).count();

        System.out.println(result);
    }
}

/*Explanation:
● sentence.split(" ") splits the sentence by spaces, and count() returns the number of words.*/