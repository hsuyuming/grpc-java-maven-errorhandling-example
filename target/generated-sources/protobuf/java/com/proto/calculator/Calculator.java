// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator/calculator.proto

package com.proto.calculator;

public final class Calculator {
  private Calculator() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_SquareRootRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_SquareRootRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_SquareRootResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_SquareRootResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033calculator/calculator.proto\022\ncalculato" +
      "r\"#\n\021SquareRootRequest\022\016\n\006number\030\001 \001(\005\")" +
      "\n\022SquareRootResponse\022\023\n\013number_root\030\001 \001(" +
      "\0012b\n\021CalculatorService\022M\n\nSquareRoot\022\035.c" +
      "alculator.SquareRootRequest\032\036.calculator" +
      ".SquareRootResponse\"\000B\030\n\024com.proto.calcu" +
      "latorP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_calculator_SquareRootRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_calculator_SquareRootRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_SquareRootRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_calculator_SquareRootResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_calculator_SquareRootResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_SquareRootResponse_descriptor,
        new java.lang.String[] { "NumberRoot", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
