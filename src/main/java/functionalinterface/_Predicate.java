package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNoValid("91123"));
        System.out.println(predicatePhone.test("911235"));
        System.out.println(containsThree.and(predicatePhone).test("91123"));
        System.out.println(containsThree.and(predicatePhone).test("92123"));
        System.out.println(containsThree.or(predicatePhone).test("92123"));
        System.out.println(predicateBi.test("sam",true));
        System.out.println(predicateBi.test("sam",false));


    }
    static BiPredicate<String,Boolean> predicateBi=(m,n)->m.contains("s")&&n;
    static Predicate<String> predicatePhone=e->e.startsWith("91")&&e.length()==5;
    static Predicate<String> containsThree=e->e.contains("3");

    static boolean isPhoneNoValid(String phNo){
        return phNo.startsWith("91")&&phNo.length()==5;
    }

}
