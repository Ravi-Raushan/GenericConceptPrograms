package genericconcept;

public class MaxNumberFinder {

    public static <X extends Comparable> X findingMaxNumber(X a1, X a2, X a3) {
        X max = a1;
        if (a2.compareTo(max) > 0) {
            max = a2;
        }
        if (a3.compareTo(max) > 0) {
            max = a3;
        }
        return max;
    }
}
