package function;

import java.util.function.BiPredicate;

public class Predicate {

    public static void main(String[] args) {

        System.out.println("Without Predicate");
        System.out.println(isPhnNumValid("01711940997"));
        System.out.println(isPhnNumValid("0191194099"));
        System.out.println(isPhnNumValid("08119406997"));

        System.out.println();
        System.out.println("With Predicate");
        System.out.println(isPhnNumValidPred.test("01711940997"));
        System.out.println(isPhnNumValidPred.test("0191194099"));
        System.out.println(isPhnNumValidPred.test("08119406997"));
        System.out.println(
                "Is Phone Number Valid and Contains 3: " +(isPhnNumValidPred.and(containsNum3).test("01711940993"))
        );

        System.out.println();
        System.out.println("With BiPredicate");
        System.out.println(
                "Is Phone Number Valid and Contains 3: " +(isPhnNumValidBiPredAndContain3.test("01711940993", "01711940997"))
        );
    }

    static boolean isPhnNumValid (String phnNum){
        return phnNum.startsWith("01") && phnNum.length() == 11;
    }

    static java.util.function.Predicate <String> isPhnNumValidPred = phnNum ->
            phnNum.startsWith("01") && phnNum.length() == 11;

    static java.util.function.Predicate <String> containsNum3 = phnNum ->
            phnNum.contains("3");

    static BiPredicate <String, String> isPhnNumValidBiPredAndContain3 = (phnNum, phnNum3) ->
            phnNum.startsWith("01")|| phnNum3.contains("3");
}

