package com.example.protobuf;

import com.example.models.Address;
import com.example.models.BodyStyle;
import com.example.models.Car;
import com.example.models.Person;
import com.google.protobuf.Int32Value;

import java.util.ArrayList;
import java.util.List;

public class PersonCompositionDemo {

    public static void main(String[] args) {

        Address address = Address.newBuilder()
                .setPinCode(411013)
                .setStreet("MG Road")
                .setCity("Pune")
                .build();
        Car car = Car.newBuilder()
                .setCompany("Tata")
                .setModel("Tigor xz")
                .setBodyStyle(BodyStyle.SEDAN)
                .build();
        Car car1 = Car.newBuilder()
                .setCompany("HondaCity")
                .setModel("civic")
                .setBodyStyleValue(1)
                .build();

        List<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car1);

        Person person = Person.newBuilder()
                .setName("Nitin")
                .setAge(Int32Value.of(30))
                .setAddress(address)
                //.addCar(car)
                //.addCar(car1)
                .addAllCar(cars)
                .build();

        System.out.println(person);
    }
}
