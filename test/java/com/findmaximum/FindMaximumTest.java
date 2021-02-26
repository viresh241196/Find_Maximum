package com.findmaximum;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FindMaximumTest {

    @Test
    public void givenIntMaximumAtFirstPosition(){
        FindMaximum checkMax = new FindMaximum();
        List<Integer> arrayList = Arrays.asList(10, 4, 2);
        Assert.assertEquals(10,checkMax.findIntMaximum(arrayList));
    }
    @Test
    public void givenIntMaximumAtSecondPosition(){
        FindMaximum checkMax = new FindMaximum();
        List<Integer> arrayList = Arrays.asList(4,10,2);
        Assert.assertEquals(10,checkMax.findIntMaximum(arrayList));
    }
    @Test
    public void givenIntMaximumAtThirdPosition(){
        FindMaximum checkMax = new FindMaximum();
        List<Integer> arrayList = Arrays.asList(4, 2, 10);
        Assert.assertEquals(10,checkMax.findIntMaximum(arrayList));
    }

    @Test
    public void givenFloatMaximumAtFirstPosition(){
        FindMaximum checkMax = new FindMaximum();
        List<Double> arrayList = Arrays.asList(10.0, 4.0, 2.0);
        Assert.assertEquals(10.0,checkMax.findFloatMaximum(arrayList));
    }
    @Test
    public void givenFloatMaximumAtSecondPosition(){
        FindMaximum checkMax = new FindMaximum();
        List<Double> arrayList = Arrays.asList( 4.0,10.0, 2.0);
        Assert.assertEquals(10.0,checkMax.findFloatMaximum(arrayList));
    }
    @Test
    public void givenFloatMaximumAtThirdPosition(){
        FindMaximum checkMax = new FindMaximum();
        List<Double> arrayList = Arrays.asList(2.0, 4.0,10.0);
        Assert.assertEquals(10.0,checkMax.findFloatMaximum(arrayList));
    }
    @Test
    public void givenStringMaximumAtFirstPosition(){
        FindMaximum checkMax = new FindMaximum();
        List<String> stringList = Arrays.asList("Peach","Apple","Banana");
        Assert.assertEquals("Peach",checkMax.findStringMaximum(stringList));
    }
    @Test
    public void givenStringMaximumAtSecondPosition(){
        FindMaximum checkMax = new FindMaximum();
        List<String> stringList = Arrays.asList("Apple","Peach","Banana");
        Assert.assertEquals("Peach",checkMax.findStringMaximum(stringList));
    }
    @Test
    public void givenStringMaximumAtThirdPosition(){
        FindMaximum checkMax = new FindMaximum();
        List<String> stringList = Arrays.asList("Apple","Banana","Peach");
        Assert.assertEquals("Peach",checkMax.findStringMaximum(stringList));
    }
}
