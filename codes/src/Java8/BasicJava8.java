package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class BasicJava8 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(
                "alpha", "bravo", "charlie", "delta"));

        for(String s : list){
            System.out.println(s);
        }
        System.out.println("-------");

        list.forEach(myString-> System.out.println(myString));
        System.out.println("-------");

        String prefix = "nato";
        list.forEach(myString -> {
            char first = myString.charAt(0);
            System.out.println(prefix+" "+myString+" means "+first);
        });

        int result = calculator((a,b) -> a+b, 5,2);
        var result2 = calculator((a,b) -> a/b, 10.0, 2.5);

        var coords = Arrays.asList(
                new double[]{47.2160, -95.2348},
                new double[]{29.1566, -89.2495},
                new double[]{35.1556, -90.0659}
        );
        coords.forEach(s-> System.out.println(Arrays.toString(s)));

        System.out.println("-------");

        BiConsumer<Double, Double> p1 = (lat, lng) ->
                System.out.printf("[lat:%.3f lon:%.3f]%n", lat, lng);

        var firstPoint = coords.get(0);
        var secondPoint = coords.get(1);
        var thirdPoint = coords.get(2);
        processPoint(firstPoint[0], firstPoint[1], p1);
        processPoint(secondPoint[0], secondPoint[1], p1);
        processPoint(thirdPoint[0], thirdPoint[1], p1);

        System.out.println("-------");

        coords.forEach(s->processPoint(s[0], s[1], p1));

        System.out.println("-------");

        String[] names = {"Ann", "Bob", "Carol", "David", "Ed", "Fred"};
        String[] randomName = randomlySelectedValue(15, names,
                () -> new Random().nextInt(0, names.length));
        System.out.println(Arrays.toString(randomName));
    }

    public static <T> T calculator(Operation<T> function, T value1, T value2){
        T result = function.operate(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }

    /*public static <T> T calculator(BinaryOperator<T> function, T value1, T value2){
        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
    }*/

    public static <T> void processPoint(T t1, T t2, BiConsumer<T, T> consumer){
        consumer.accept(t1, t2);
    }

    public static String[] randomlySelectedValue(int count, String[] value, Supplier<Integer> s){
        String[] selectedValue = new String[count];
        for (int i = 0; i < count; i++) {
            selectedValue[i] = value[s.get()];
        }
        return selectedValue;
    }
}
