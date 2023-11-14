package functionalinteface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        //Function takes 1 argument and 1 produces result
        System.out.println(incrementByOne.apply(8));
        System.out.println(multiplyBy10.apply(89));
        Integer apply = incrementByOne.andThen(multiplyBy10).apply(50);
        System.out.println(apply);
        Function<Integer, Integer> incrementBy1AndThenMultiplyBy10 = incrementByOne.andThen(multiplyBy10);
        System.out.println(incrementBy1AndThenMultiplyBy10.apply(7));

        //BiFunction takes 2 arguments and produces 1 result
        System.out.println(
                biFunction.apply(3,4)
        );
    }

    static Function<Integer, Integer> incrementByOne = number -> number+1;

    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> biFunction = (numberToIncrementBy1, numberToMultiplyBy) ->
            (numberToIncrementBy1 +1) * numberToMultiplyBy;
}
