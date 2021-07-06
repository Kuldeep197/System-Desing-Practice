package com.lld.cabbooking.exception;

public class RiderExists extends RuntimeException{
    public RiderExists(String message){
        super(message);
    }
}
