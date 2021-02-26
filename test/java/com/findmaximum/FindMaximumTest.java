package com.findmaximum;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FindMaximumTest {

    @Test
    public void givenMaximumAtFirstPosition(){
        FindMaximum checkMax = new FindMaximum();
        List<Integer> arrayList = Arrays.asList(10, 4, 2);
        Assert.assertEquals(10,checkMax.findMaximum(arrayList));
    }
    @Test
    public void givenMaximumAtSecondPosition(){
        FindMaximum checkMax = new FindMaximum();
        List<Integer> arrayList = Arrays.asList(4,10,2);
        Assert.assertEquals(10,checkMax.findMaximum(arrayList));
    }
    @Test
    public void givenMaximumAtThirdPosition(){
        FindMaximum checkMax = new FindMaximum();
        List<Integer> arrayList = Arrays.asList(4, 2, 10);
        Assert.assertEquals(10,checkMax.findMaximum(arrayList));
    }
}
