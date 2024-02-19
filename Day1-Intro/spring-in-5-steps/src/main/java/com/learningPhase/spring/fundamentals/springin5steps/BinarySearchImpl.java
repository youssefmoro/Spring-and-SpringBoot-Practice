package com.learningPhase.spring.fundamentals.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgo sortAlgo;

    public BinarySearchImpl(SortAlgo sortAlgo) {
        super();
        this.sortAlgo = sortAlgo;
    }

    public int binarySearch(int[] numbers,int numberToSearchFor )
    {
        //sort your arr of numbers
         int [] sortedNumbers=sortAlgo.sort(numbers);
        System.out.println(sortAlgo);
        //search for the number req

        //return the index where we found this number

        return 3;
    }
}
