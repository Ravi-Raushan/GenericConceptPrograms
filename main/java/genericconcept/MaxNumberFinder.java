package genericconcept;

public class MaxNumberFinder<X extends Comparable> {
    public X findingMaxNumber(X... pram)
    {
        for (int i = 0; i < pram.length - 1; i++)
        {
            for (int j = 0; j < pram.length - i - 1; j++)
            {
                if (pram[j].compareTo(pram[j + 1]) > 0)
                {
                    X temp = pram[j];
                    pram[j] = pram[j + 1];
                    pram[j + 1] = temp;
                }
            }
        }
        printMaxNumber(pram[pram.length - 1]);
        return pram[pram.length - 1];
    }
    public static <X> void printMaxNumber(X maxNumberToBePrinted) {
        System.out.println("Maximum number among three number:" + maxNumberToBePrinted);
    }
}
