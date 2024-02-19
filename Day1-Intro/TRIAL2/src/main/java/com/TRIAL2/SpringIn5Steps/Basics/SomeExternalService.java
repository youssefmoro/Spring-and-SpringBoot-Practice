package com.TRIAL2.SpringIn5Steps.Basics;

import jakarta.annotation.PreDestroy;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SomeExternalService {
    private org.slf4j.Logger LOGGER= LoggerFactory.getLogger(this.getClass());
    @Autowired
    //@Qualifier("QUICK")
    @Qualifier("BUBB")
    private SortAlgo sortAlgo;

//    public SomeExternalService(SortAlgo sortAlgo) {
//        super();
//        this.sortAlgo = sortAlgo;
//    }
//    public void setSortAlgo(SortAlgo sortAlgo) {
//        this.sortAlgo = sortAlgo;
//    }

    public int binarySearch(int[] numbers,int numberToSearchFor )
    {
        //sort your arr of numbers
         int [] sortedNumbers= sortAlgo.sort(numbers);
        System.out.println(sortAlgo);
        //search for the number req

        //return the index where we found this number
        return 3;
    }
//    @PostConstruct
//    public void postConstruct()
//    {
//        LOGGER.info("POSTCONSTRUCT");
//    }
    @PreDestroy
    public void  predestroy()
    {
        LOGGER.info("PREDESTROY");
    }
}
