// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package com.example.models;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int32 age = 2;</code>
   * @return The age.
   */
  int getAge();

  /**
   * <code>.Address address = 3;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <code>.Address address = 3;</code>
   * @return The address.
   */
  com.example.models.Address getAddress();
  /**
   * <code>.Address address = 3;</code>
   */
  com.example.models.AddressOrBuilder getAddressOrBuilder();

  /**
   * <code>.Car car = 4;</code>
   * @return Whether the car field is set.
   */
  boolean hasCar();
  /**
   * <code>.Car car = 4;</code>
   * @return The car.
   */
  com.example.models.Car getCar();
  /**
   * <code>.Car car = 4;</code>
   */
  com.example.models.CarOrBuilder getCarOrBuilder();
}
