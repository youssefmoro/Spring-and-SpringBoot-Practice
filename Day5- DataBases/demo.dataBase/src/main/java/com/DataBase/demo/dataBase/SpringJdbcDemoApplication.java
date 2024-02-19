package com.DataBase.demo.dataBase;

import com.DataBase.demo.dataBase.Entity.Person;
import com.DataBase.demo.dataBase.Jpa.PersonJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import javax.security.auth.login.AccountException;
import java.util.Optional;


//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PersonJpaRepository repositry;

    public static void main(String[] args) {
        SpringApplication.run(SpringJdbcDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        logger.info("User id 10001 -> {}",repositry.findById(10001) );
        Optional<Person> p = repositry.findById(10001);
        Person p = new Person();
        p.setName(resuest.getName());
        repositry.save(p);
    }
}
