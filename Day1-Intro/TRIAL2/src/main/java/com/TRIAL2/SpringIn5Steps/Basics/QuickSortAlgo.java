package com.TRIAL2.SpringIn5Steps.Basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("QUICK")
public class QuickSortAlgo implements SortAlgo{
    public int[] sort(int [] numbers)
    {
        //logic

        //number
        return numbers;
    }
}
