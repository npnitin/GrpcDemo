// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: credentials.proto

package com.example.models;

public interface CredentialsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Credentials)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.EmailCredentials emailMode = 1;</code>
   * @return Whether the emailMode field is set.
   */
  boolean hasEmailMode();
  /**
   * <code>.EmailCredentials emailMode = 1;</code>
   * @return The emailMode.
   */
  com.example.models.EmailCredentials getEmailMode();
  /**
   * <code>.EmailCredentials emailMode = 1;</code>
   */
  com.example.models.EmailCredentialsOrBuilder getEmailModeOrBuilder();

  /**
   * <code>.PhoneOTP phoneOtp = 2;</code>
   * @return Whether the phoneOtp field is set.
   */
  boolean hasPhoneOtp();
  /**
   * <code>.PhoneOTP phoneOtp = 2;</code>
   * @return The phoneOtp.
   */
  com.example.models.PhoneOTP getPhoneOtp();
  /**
   * <code>.PhoneOTP phoneOtp = 2;</code>
   */
  com.example.models.PhoneOTPOrBuilder getPhoneOtpOrBuilder();

  public com.example.models.Credentials.ModeCase getModeCase();
}
