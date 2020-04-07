package genericconcept;

import org.junit.Assert;
import org.junit.Test;

public class GenericTest {
    MaxNumberFinder maxNumberFinder = new MaxNumberFinder();
    @Test
    public void givenMaxNumberAtAnyPositionShouldReturnTheSameInteger() {
        Integer maxNumber = (Integer)maxNumberFinder.findingMaxNumber(80, 29, 45,90);
        Assert.assertEquals(Integer.valueOf(90), maxNumber);
    }
    @Test
    public void givenMaxNumberAtAnyPositionShouldReturnTheSameFloat() {
        Float maxNumber = (Float)maxNumberFinder.findingMaxNumber(53.2f, 45.6f, 2.9f,100.23f);
        Assert.assertEquals(Float.valueOf(100.23f), maxNumber);
    }
    @Test
    public void givenMaxStringAtAnyPositionShouldReturnTheSameString() {
        String maxString = (String)maxNumberFinder.findingMaxNumber("Grapes","Peach","Apple","Banana");
        Assert.assertEquals(String.valueOf("Peach"), maxString);
    }
}
