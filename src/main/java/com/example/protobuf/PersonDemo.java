package com.example.protobuf;

import com.example.models.Person;
import com.google.protobuf.Int32Value;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonDemo {

    public static void main(String[] args) throws IOException {

        Person nitin = Person.newBuilder()
                .setName("Nitin")
                .setAge(Int32Value.of(25))
                .build();

        System.out.println(nitin);

        Path path = Paths.get("nitin.ser");
        //Files.write(path,nitin.toByteArray());

        byte[] bytes = Files.readAllBytes(path);
        Person newNitin = Person.parseFrom(bytes);

        System.out.println(newNitin);


    }
}
