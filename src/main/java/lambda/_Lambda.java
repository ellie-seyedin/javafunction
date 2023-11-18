package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Lambda {
    public static void main(String[] args) {
        Function<String, String> upperCaseName = String::toUpperCase;
        BiFunction<String, Integer, String> function = (name, age) ->{
            //logic
            if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };
        String upper = upperCaseName.apply("Ella");
        System.out.println(upper);
        String up = function.apply("sina", 30);
        System.out.println(up);
    }
}
