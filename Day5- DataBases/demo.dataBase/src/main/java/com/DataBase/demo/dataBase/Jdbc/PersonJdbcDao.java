package com.DataBase.demo.dataBase.Jdbc;

import com.DataBase.demo.dataBase.Entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Repository
public class PersonJdbcDao {
    // CREATE A CONNECTION USING SPRING
    @Autowired
    JdbcTemplate jdbcTemplate;
     class customPersonRowMapper implements RowMapper<Person>
     {

         @Override
         public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
             Person person=new Person();
             person.setId(rs.getInt("id"));
             person.setName(rs.getString("name"));
             person.setLocation(rs.getString("Location"));
             person.setBirthDate(String.valueOf(rs.getTimestamp("birth_date")));
             return person;
         }
     }

    public List<Person> findAll()
    {
        return jdbcTemplate.query("select * from person",new customPersonRowMapper());//new BeanPropertyRowMapper(Person.class));
    }
    public Person findThroughId(int id)
    {
        return (Person) jdbcTemplate.queryForObject("select * from person where id=?",new Object[]{id},new customPersonRowMapper());
    }
    public Person findThroughName(String Name)
    {
        return (Person) jdbcTemplate.queryForObject("select * from person where Name=?",new Object[]{Name},new customPersonRowMapper());
    }
    public Person findThroughLocation(String Location)
    {
        return (Person) jdbcTemplate.queryForObject("select * from person where Location=?",new Object[]{Location},new customPersonRowMapper());
    }
    public int deleteThroughId(int id)
    {
        return jdbcTemplate.update("delete from person where id=?",new Object[]{id});
    }
    public int insertNewPerson(Person person) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date birthDate = dateFormat.parse(person.getBirthDate());
            return jdbcTemplate.update("insert into person (id, name, location, birth_date)" + "values (?, ?, ?, ?)", new Object[]{person.getId(), person.getName(), person.getLocation(), birthDate});
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        } catch (DataAccessException ex) {
            throw new RuntimeException(ex);
        }
    }
    public int updatePerson(Person person) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date birthDate = dateFormat.parse(person.getBirthDate());
            return jdbcTemplate.update("UPDATE person SET name = ?, location = ?, birth_date = ? WHERE id = ?",new Object[]{person.getName(), person.getLocation(),birthDate,person.getId()});
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        } catch (DataAccessException ex) {
            throw new RuntimeException(ex);
        }

    }
}
