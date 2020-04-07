package genericconcept;

import org.junit.Assert;
import org.junit.Test;

public class GenericTest {
    @Test
    public void givenMaxNumberAtFirstPositionShouldReturnTheSameInteger() {
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder(80, 29, 45);
        Assert.assertEquals(Integer.valueOf(80), maxNumberFinder.testMaximum());
    }
    @Test
    public void givenMaxNumberAtSecondPositionShouldReturnTheSameInteger() {
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder(29, 80, 45);
        Assert.assertEquals(Integer.valueOf(80), maxNumberFinder.testMaximum());
    }
    @Test
    public void givenMaxNumberAtThirdPositionShouldReturnTheSameInteger() {
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder(29, 45, 80);
        Assert.assertEquals(Integer.valueOf(80), maxNumberFinder.testMaximum());
    }
    @Test
    public void givenMaxNumberAtFirstPositionShouldReturnTheSameFloat() {
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder(53.2f, 45.6f, 2.9f);
        Assert.assertEquals(Float.valueOf(53.2f), maxNumberFinder.testMaximum());
    }
    @Test
    public void givenMaxNumberAtSecondPositionShouldReturnTheSameFloat() {
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder( 45.6f, 53.2f, 2.9f);
        Assert.assertEquals(Float.valueOf(53.2f), maxNumberFinder.testMaximum());
    }
    @Test
    public void givenMaxNumberAtThirdPositionShouldReturnTheSameFloat() {
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder( 45.6f, 2.9f, 53.2f);
        Assert.assertEquals(Float.valueOf(53.2f), maxNumberFinder.testMaximum());
    }
    @Test
    public void givenMaxStringAtFirstPositionShouldReturnTheSameString() {
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder("Peach","Apple","Banana");
        Assert.assertEquals(String.valueOf("Peach"), maxNumberFinder.testMaximum());
    }
    @Test
    public void givenMaxStringAtSecondPositionShouldReturnTheSameString() {
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder("Apple","Peach","Banana");
        Assert.assertEquals(String.valueOf("Peach"), maxNumberFinder.testMaximum());
    }
    @Test
    public void givenMaxStringAtThirdPositionShouldReturnTheSameString() {
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder("Apple","Banana","Peach");
        Assert.assertEquals(String.valueOf("Peach"), maxNumberFinder.testMaximum());
    }
}
