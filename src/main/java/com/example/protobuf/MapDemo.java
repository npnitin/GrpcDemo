package com.example.protobuf;

import com.example.models.Car;
import com.example.models.Dealer;

public class MapDemo {

    public static void main(String[] args) {

        Car car = Car.newBuilder()
                .setCompany("Tata")
                .setModel("Tigor xz")
                .build();
        Car car1 = Car.newBuilder()
                .setCompany("HondaCity")
                .setModel("civic")
                .build();
        Dealer dealer = Dealer.newBuilder()
                .putModel(2005,car)
                .putModel(2005,car1)
                .build();

        System.out.println(dealer);

    }

}
