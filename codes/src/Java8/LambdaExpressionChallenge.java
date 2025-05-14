package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LambdaExpressionChallenge {
    private static Random random = new Random();

    public static void main(String[] args) {
        String[] names = {"Anna", "Bob", "Carole", "David", "Ed", "Fred", "Gary"};
        Arrays.setAll(names, value -> names[value].toUpperCase());
        System.out.println("--> Transform to Uppercase");
        System.out.println(Arrays.toString(names));

        List<String> backedByArray = Arrays.asList(names);
        backedByArray.replaceAll(s -> s += " " + getRandomChar('A', 'Z') + ".");
        System.out.println("--> Add Random middle initial");
        System.out.println(Arrays.toString(names));

        backedByArray.replaceAll(s -> s += " " + reverseString(s.split(" ")[0]));
        System.out.println("--> Add reverse name as Last Name");
        //Arrays.asList(names).forEach(s -> System.out.println(s));
        backedByArray.forEach(s -> System.out.println(s));

        List<String> newList = new ArrayList<>(List.of(names));
        /*newList.removeIf(s -> s.substring(0, s.indexOf(" "))
                .equals(s.substring(s.lastIndexOf(" ")+1)));*/
        newList.removeIf(s -> {
            String first = s.substring(0, s.indexOf(" "));
            String last = s.substring(s.lastIndexOf(" ") + 1);
            return first.equals(last);
        });
        System.out.println("--> Remove names where first=last");
        newList.forEach(s -> System.out.println(s));
    }

    public static char getRandomChar(char startChar, char endChar) {
        return (char) random.nextInt((int) startChar, (int) endChar + 1);
    }

    public static String reverseString(String firstName) {
        return new StringBuilder(firstName).reverse().toString();
    }
}
