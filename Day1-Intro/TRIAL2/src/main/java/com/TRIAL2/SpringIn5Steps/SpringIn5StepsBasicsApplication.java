//package com.TRIAL2.SpringIn5Steps;
//
//import com.TRIAL2.SpringIn5Steps.Basics.SomeExternalService;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
////@SpringBootApplication
////@ComponentScan("com.TRIAL2.SpringIn5Steps")
//@Configuration
//@ComponentScan("com.TRIAL2.SpringIn5Steps")
//public class SpringIn5StepsBasicsApplication {
//
//	public static void main(String[] args)  {
//		//SomeExternalService binarySearch=new SomeExternalService(new BubbleSortAlgo()); NO NEED AS APPLICATTION CONTEXT USING BEANS AND DEP ANNOTATIONS WILL DO SO FOR US
//		//System.out.println(result);
//		// all these steps to prevent ourselves from doing it manually and leaving spring to do instead"check screenshot"
//		// make instance of the appcontext which by default knows what are the beans and dep. and where to find them
//		try(AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext("com.TRIAL2.SpringIn5Steps")) {
//			//SpringApplication.run(SpringIn5StepsBasicsApplication.class, args);
//			//then we made an instance of binarysearch class which is a bean we will inject to some dep. to make a specific functionality needed
//			//then wel will assign this instance to encapsulate the dep. or logic we will pass afterwards to this specific functionality
//			SomeExternalService binarySearch = applicationContext.getBean(SomeExternalService.class);
//			SomeExternalService binarySearch1 = applicationContext.getBean(SomeExternalService.class);
//			System.out.println(binarySearch1);
//			System.out.println(binarySearch);
//			//finally we well pass the dep(will work as autowired works) on which the bean will work throughly
//			int result = binarySearch.binarySearch(new int[]{1, 2, 5, 11, 32, 7}, 3);
//			System.out.println(result);
//		}
//
//	}
//
//}
