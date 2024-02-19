package com.learningPhase.spring.fundamentals.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args)  {
		//BinarySearchImpl binarySearch=new BinarySearchImpl(new BubbleSortAlgo()); NO NEED AS APPLICATTION CONTEXT USING BEANS AND DEP ANNOTATIONS WILL DO SO FOR US
		//System.out.println(result);

		// all these steps to prevent ourselves from doing it manually and leaving spring to do instead"check screenshot"
		// make instance of the appcontext which bydefault knows what are the beans and dep. and where to find them
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		//then we made an instance of binarysearch class which is a bean we will inject to some dep. to make a specific functionality needed
		//then wel will assign this instance to encapsulate the dep. or logic we will pass afterwards to this specific functionality
		BinarySearchImpl binarySearch=applicationContext.getBean(BinarySearchImpl.class);
		//finally we well pass the dep(will work as autowired works) on which the bean will work throughly
		int result=binarySearch.binarySearch(new int[] {1,2,5,11,32,7},3);
		System.out.println(result);

	}

}
