package com.example.entity;

public class Car {
    public Long carId;
    public Long personId;

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", personId=" + personId +
                '}';
    }
}
