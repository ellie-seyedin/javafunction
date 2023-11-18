package callback;

import java.util.function.Consumer;

public class LikeJavasScript {
    public static void main(String[] args) {
        hello("Ella", null, value -> System.out.println("LastName not provided for " + value));
        hello2("Sina", null, ()-> System.out.println("LastName not provided.") );
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if(lastName != null){
            System.out.println(lastName);
        }else {
            callback.accept(firstName);
        }
    }

    static void hello2(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if(lastName != null){
            System.out.println(lastName);
        }else {
            callback.run();
        }
    }

    //Javascript code
//    function hello(firstName, lastName, callback){
//        console.log(firstName);
//        if (lastName){
//            console.log(lastName);
//        }else{
//            callback()
//        }

}
