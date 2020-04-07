package genericconcept;

import org.junit.Assert;
import org.junit.Test;

public class GenericTest {
    @Test
    public void givenMaxNumberAtFirstPositionShouldReturnTheSameInteger() {
        Integer maxNumber = MaxNumberFinder.findingMaxNumber(80, 29, 45);
        Assert.assertEquals(Integer.valueOf(80), maxNumber);
    }
    @Test
    public void givenMaxNumberAtSecondPositionShouldReturnTheSameInteger() {
        Integer maxNumber = MaxNumberFinder.findingMaxNumber(29, 80, 45);
        Assert.assertEquals(Integer.valueOf(80), maxNumber);
    }
    @Test
    public void givenMaxNumberAtThirdPositionShouldReturnTheSameInteger() {
        Integer maxNumber = MaxNumberFinder.findingMaxNumber(29, 45, 80);
        Assert.assertEquals(Integer.valueOf(80), maxNumber);
    }
    @Test
    public void givenMaxNumberAtFirstPositionShouldReturnTheSameFloat() {
        Float maxNumber = MaxNumberFinder.findingMaxNumber(53.2f, 45.6f, 2.9f);
        Assert.assertEquals(Float.valueOf(53.2f), maxNumber);
    }
    @Test
    public void givenMaxNumberAtSecondPositionShouldReturnTheSameFloat() {
        Float maxNumber = MaxNumberFinder.findingMaxNumber(45.6f, 53.2f, 2.9f);
        Assert.assertEquals(Float.valueOf(53.2f), maxNumber);
    }
    @Test
    public void givenMaxNumberAtThirdPositionShouldReturnTheSameFloat() {
        Float maxNumber = MaxNumberFinder.findingMaxNumber(45.6f, 2.9f, 53.2f);
        Assert.assertEquals(Float.valueOf(53.2f), maxNumber);
    }
    @Test
    public void givenMaxStringAtFirstPositionShouldReturnTheSameString() {
        String maxString = MaxNumberFinder.findingMaxNumber("Peach","Apple","Banana");
        Assert.assertEquals(String.valueOf("Peach"), maxString);
    }
    @Test
    public void givenMaxStringAtSecondPositionShouldReturnTheSameString() {
        String maxString = MaxNumberFinder.findingMaxNumber("Apple","Peach","Banana");
        Assert.assertEquals(String.valueOf("Peach"), maxString);
    }
    @Test
    public void givenMaxStringAtThirdPositionShouldReturnTheSameString() {
        String maxString = MaxNumberFinder.findingMaxNumber("Apple","Banana","Peach");
        Assert.assertEquals(String.valueOf("Peach"), maxString);
    }
}
