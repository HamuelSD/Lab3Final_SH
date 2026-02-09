package com.samuel.lab3.Exceptions;

public class NightReservationException extends Exception {
    public NightReservationException(int nights) {
        super("Invalid number of nights: " + nights);
    }
}




