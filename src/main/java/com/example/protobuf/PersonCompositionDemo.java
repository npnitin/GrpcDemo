package com.example.protobuf;

import com.example.models.Address;
import com.example.models.Car;
import com.example.models.Person;

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
                .build();

        Person person = Person.newBuilder()
                .setName("Nitin")
                .setAge(30)
                .setAddress(address)
                .setCar(car)
                .build();

        System.out.println(person);
    }
}
