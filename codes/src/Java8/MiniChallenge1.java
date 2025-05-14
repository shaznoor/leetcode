package Java8;

import java.util.Arrays;
import java.util.function.Consumer;

public class MiniChallenge1 {
    public static void main(String[] args) {
        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

        Consumer<String> printWordsLambda = sentence -> {
            String[] parts = sentence.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        printWords.accept("Hello how are you!");
        printWordsLambda.accept("Hello Mr Hassan");

        Consumer<String> printWordsLambdaForEach = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };

        Consumer<String> printWordsLambdaForEachConcise = sentence -> {
            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };
    }
}
