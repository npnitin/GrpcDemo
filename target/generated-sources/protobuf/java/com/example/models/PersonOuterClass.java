// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package com.example.models;

public final class PersonOuterClass {
  private PersonOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Address_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Address_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Car_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Car_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014person.proto\"8\n\007Address\022\017\n\007pinCode\030\001 \001" +
      "(\005\022\016\n\006street\030\002 \001(\t\022\014\n\004city\030\003 \001(\t\"%\n\003Car\022" +
      "\017\n\007company\030\001 \001(\t\022\r\n\005model\030\002 \001(\t\"Q\n\006Perso" +
      "n\022\014\n\004name\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\022\031\n\007address\030" +
      "\003 \001(\0132\010.Address\022\021\n\003car\030\004 \001(\0132\004.CarB\026\n\022co" +
      "m.example.modelsP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Address_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Address_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Address_descriptor,
        new java.lang.String[] { "PinCode", "Street", "City", });
    internal_static_Car_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Car_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Car_descriptor,
        new java.lang.String[] { "Company", "Model", });
    internal_static_Person_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Person_descriptor,
        new java.lang.String[] { "Name", "Age", "Address", "Car", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
