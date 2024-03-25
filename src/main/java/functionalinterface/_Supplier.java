package functionalinterface;

import java.util.function.Supplier;

public class _Supplier
{
    public static void main(String[] args) {
        System.out.println(getConnectionUrl.get());
    }
    static Supplier<String> getConnectionUrl=()->"jdbc://localhost:5432/postgres";
}
