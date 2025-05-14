package Java8;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MiniChallenge2345 {
    public static void main(String[] args) {
        UnaryOperator<String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        String ans = everySecondChar.apply("1234567890");
        System.out.println(ans);

        String ans1 = everySecondCharacter(everySecondChar, "1234567890");
        System.out.println(ans1);
    }

    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    public static String everySecondCharacter(Function<String, String> function, String source) {
        return function.apply(source);
    }
}
