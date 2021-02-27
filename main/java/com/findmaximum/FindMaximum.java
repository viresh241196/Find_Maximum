package com.findmaximum;

import java.util.*;

public class FindMaximum<T>{
    private T[] inputArray;

    public <T>Comparable findGenericMaximum(T[] myNumber){
        List myNumberList = Arrays.asList(myNumber);
        Comparable max = Collections.max(myNumberList);
        return max;
    }
}

