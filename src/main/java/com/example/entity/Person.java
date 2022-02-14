package com.example.entity;

public class Person {
    public Long personId;
    public Car car;
    public String personName;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", car=" + car.toString() +
                ", name='" + personName + '\'' +
                '}';
    }
}
