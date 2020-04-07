package genericconcept;

public class MaxNumberFinder<X extends Comparable> {
    X a;
    X b;
    X c;

    public MaxNumberFinder(X a, X b, X c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public   <X> X testMaximum(){
        return (X) testMaximum(a,b,c);
    }

    public static <X extends Comparable> X testMaximum(X x,X y,X z) {
        X max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
}
