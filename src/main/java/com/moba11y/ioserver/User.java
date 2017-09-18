package com.moba11y.ioserver;



public class User {
    public String email;
    public UserType type;

    public enum UserType {
        VOLUNTEER,
        STUDENT
    }
}