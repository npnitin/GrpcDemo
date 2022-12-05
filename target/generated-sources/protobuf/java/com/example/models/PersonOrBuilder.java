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
   * <code>.common.Address address = 3;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <code>.common.Address address = 3;</code>
   * @return The address.
   */
  com.example.models.Address getAddress();
  /**
   * <code>.common.Address address = 3;</code>
   */
  com.example.models.AddressOrBuilder getAddressOrBuilder();

  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  java.util.List<com.example.models.Car> 
      getCarList();
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  com.example.models.Car getCar(int index);
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  int getCarCount();
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  java.util.List<? extends com.example.models.CarOrBuilder> 
      getCarOrBuilderList();
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  com.example.models.CarOrBuilder getCarOrBuilder(
      int index);
}
