package com.lld.cabbooking.exception;

import javax.management.remote.JMXServerErrorException;

public class RiderNotFound extends RuntimeException{
    public RiderNotFound(String message)
    {
        super(message);
    }
}
