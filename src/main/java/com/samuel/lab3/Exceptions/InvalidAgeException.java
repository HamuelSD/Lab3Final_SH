package com.samuel.lab3.Exceptions;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(int age) {
        super("Invalid number for age: " + age);
    }
}
