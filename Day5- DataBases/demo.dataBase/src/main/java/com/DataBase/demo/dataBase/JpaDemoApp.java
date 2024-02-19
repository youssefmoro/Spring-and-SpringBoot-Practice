//package com.DataBase.demo.dataBase;
//
//import com.DataBase.demo.dataBase.Jdbc.PersonJdbcDao;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;
//
//@SpringBootApplication
//public class JpaDemoApplication implements CommandLineRunner {
//
//	Logger logger= LoggerFactory.getLogger(this.getClass());
//	@Autowired
//	PersonJdbcDao personJdbcDao;
//
//	public static void main(String[] args) {
//		ConfigurableApplicationContext applicationContext = SpringApplication.run(JpaDemoApplication.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		Person person=new Person();
//		person.setName("ahmed");person.setId(10004);person.setLocation("cairo");person.setBirthDate("12-8-1989");
//		logger.info("updated rows is {}",personJdbcDao.updatePerson(person));
//		//logger.info("inserted rows is {}",personJdbcDao.insertNewPerson(person));
//		//logger.info("deleted no of users through id {} is {}",10004,personJdbcDao.deleteThroughId((int)10004));
//		//logger.info("user through location {} is {}","Egypt",personJdbcDao.findThroughLocation("cairo"));
//		//logger.info("user through Name {} is {}","joe",personJdbcDao.findThroughName("Yousef"));
//		//logger.info("user through id{} is {}",10004,personJdbcDao.findThroughId(10004));
//        //logger.info("user -> {}",personJdbcDao.findAll());
//	}
//}
