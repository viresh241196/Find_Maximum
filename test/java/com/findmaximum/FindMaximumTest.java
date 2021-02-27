package com.findmaximum;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    @Test
    public void givenIntMaximumAtFirstPosition() {
        FindMaximum checkMax = new FindMaximum();
        Object[] arr = {10, 2, 1,5,4};
        Assert.assertEquals(arr[0], checkMax.findGenericMaximum(arr));
    }

    @Test
    public void givenIntMaximumAtSecondPosition() {
        FindMaximum checkMax = new FindMaximum();
        Object[] arr = {2,10,1,3,7};
        Assert.assertEquals(arr[1], checkMax.findGenericMaximum(arr));
    }

    @Test
    public void givenIntMaximumAtThirdPosition() {
        FindMaximum checkMax = new FindMaximum();
        Object[] arr = {2,1,10};
        Assert.assertEquals(arr[2], checkMax.findGenericMaximum(arr));
    }

    @Test
    public void givenFloatMaximumAtFirstPosition() {
        FindMaximum checkMax = new FindMaximum();
        Object[] arr = {10.0, 1.0, 2.0};
        Assert.assertEquals(arr[0], checkMax.findGenericMaximum(arr));
    }

    @Test
    public void givenFloatMaximumAtSecondPosition() {
        FindMaximum checkMax = new FindMaximum();
        Object[] arr = {2.0, 10.0, 1.0};
        Assert.assertEquals(arr[1], checkMax.findGenericMaximum(arr));
    }

    @Test
    public void givenFloatMaximumAtThirdPosition() {
        FindMaximum checkMax = new FindMaximum();
        Object[] arr = {2.0, 1.0, 10.0};
        Assert.assertEquals(arr[2], checkMax.findGenericMaximum(arr));
    }

    @Test
    public void givenStringMaximumAtFirstPosition() {
        FindMaximum checkMax = new FindMaximum();
        Object[] arr = {"Peach", "Banana", "Apple"};
        Assert.assertEquals(arr[0], checkMax.findGenericMaximum(arr));
    }

    @Test
    public void givenStringMaximumAtSecondPosition() {
        FindMaximum checkMax = new FindMaximum();
        Object[] arr = {"Apple", "Peach", "Banana"};
        Assert.assertEquals(arr[1], checkMax.findGenericMaximum(arr));
    }

    @Test
    public void givenStringMaximumAtThirdPosition() {
        FindMaximum checkMax = new FindMaximum();
        Object[] arr = {"Banana", "Apple", "Peach"};
        Assert.assertEquals(arr[2], checkMax.findGenericMaximum(arr));
    }
}
