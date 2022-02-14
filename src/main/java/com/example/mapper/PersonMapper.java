package com.example.mapper;

import com.example.entity.Car;
import com.example.entity.Person;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PersonMapper {

    @Select("select * from car where car.car_id=#{id}")
    @Results({
            @Result(column = "car_id", property = "carId"),
            @Result(column = "person_id", property = "personId"),
    })
    Car getCarById(Long id);

    @Select("select * from person where person.person_id=#{id}")
    @Results({
            @Result(column = "person_id", property = "personId"),
            @Result(column = "name", property = "personName"),
            @Result(property = "car", column = "person_id", one = @One(select = "getCarById"))
    })
    Person getPersonById(Long id);

    @Results({
            @Result(column = "person_id", property = "personId"),
            @Result(column = "name", property = "personName")
    })
    @Select("select * from person")
    List<Person> getAllPerson();
}
