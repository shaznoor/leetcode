package Java8;

import java.util.Arrays;
import java.util.List;

public class MethodReference1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "Anna", "Bob", "Chuck", "Dave");
        list.forEach(s -> System.out.println(s));
    }
}
