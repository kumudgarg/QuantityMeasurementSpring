package com.quantitymeasurement.service;

public class QuantityMeasurementException extends Exception {

    public ExceptionType type;

   public enum ExceptionType{
        CLASS_NOT_EQUAL;
    }

    public QuantityMeasurementException(String message,ExceptionType type) {
        super(message);
        this.type = type;
    }

    public QuantityMeasurementException(ExceptionType type) {
        this.type = type;
    }
}
