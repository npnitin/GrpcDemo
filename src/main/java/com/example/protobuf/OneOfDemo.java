package com.example.protobuf;

import com.example.models.Credentials;
import com.example.models.EmailCredentials;
import com.example.models.PhoneOTP;

public class OneOfDemo {

    public static void main(String[] args) {

        EmailCredentials  emailCredentials = EmailCredentials.newBuilder()
                .setEmail("test@gmail.com")
                .setPassword("123")
                .build();

        PhoneOTP phoneOTP = PhoneOTP.newBuilder()
                .setNumber(1234567901)
                .setCode(1234567901)
                .build();

        Credentials credentialsEmail = Credentials.newBuilder()
                .setEmailMode(emailCredentials)
                .build();

        Credentials phoneCredentials = Credentials.newBuilder()
                .setPhoneOtp(phoneOTP)
                .build();

       // login(credentialsEmail);
        login(phoneCredentials);


    }

    private static void login(Credentials credentials){

        switch(credentials.getModeCase()){
            case EMAILMODE:
                System.out.println(credentials.getEmailMode());
                break;
            case PHONEOTP:
                System.out.println(credentials.getPhoneOtp());
                break;
        }
       // System.out.println(credentials.getEmailMode());
       // System.out.println(credentials.getPhoneOtp());
    }
}
