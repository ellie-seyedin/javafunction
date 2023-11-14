package functionalinteface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionURL());

        System.out.println("With supplier :");
        System.out.println(getDBConnectionURLSupplier.get());
        System.out.println(getDBConnectionURLSupplierList.get());
    }

    static String getDBConnectionURL(){
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDBConnectionURLSupplier = () -> "jdbc://localhost:5432/users";

    static Supplier<List<String>> getDBConnectionURLSupplierList = () -> List.of("jdbc://localhost:5432/users"
    ,"odbc://localhost:1234/ids");
}
