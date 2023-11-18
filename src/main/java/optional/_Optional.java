package optional;

import java.util.List;
import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 34, 6);

        Object o = Optional.ofNullable(null).orElse(list);
        System.out.println(o);

        Object o1 = Optional.ofNullable(null).orElseGet(()-> "default");
        System.out.println(o1);

        Object o2 = Optional.ofNullable("Hello").orElseGet(()-> "default");
        System.out.println(o2);

        Object o3 = Optional.ofNullable("ee").orElseThrow(IllegalArgumentException::new);
        System.out.println(o3);

        Optional.ofNullable("elaheh").ifPresent(email -> System.out.println("elaheh@gmail.com"));

        Optional.ofNullable(null).ifPresentOrElse(email -> System.out.println("elaheh@gmail.com"),
                ()-> System.out.println("Can not send an email"));

        Optional.ofNullable("Sina").ifPresentOrElse(email -> System.out.println(email + "@gmail.com "),
                ()-> System.out.println("Can not send an email"));
    }
}
