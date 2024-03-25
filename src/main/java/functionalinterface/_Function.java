package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int inc=increment(0);
        System.out.println(inc);
        Function<Integer,Integer> newFunction=incByOne.andThen(mulByFive);
        System.out.println(newFunction.apply(1));

        System.out.println(addByOneandMulBy10.apply(1,20));
    }

    static BiFunction<Integer,Integer,Integer> addByOneandMulBy10= (n,m)->(n+1)*m;

    static Function<Integer,Integer> incByOne=num->++num;
    static Function<Integer,Integer> mulByFive=n->n*5;


    static int increment(int i){
        return i+1;
    }
}
