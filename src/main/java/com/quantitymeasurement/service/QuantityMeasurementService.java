package com.quantitymeasurement.service;

import com.quantitymeasurement.model.InputMeasurementDto;

public interface QuantityMeasurementService {


    public Boolean compareUnits(InputMeasurementDto meas1, InputMeasurementDto meas2) throws QuantityMeasurementException;

    public double additionOfUnits(InputMeasurementDto meas1, InputMeasurementDto meas2) throws QuantityMeasurementException;

    public Boolean temperatureConversion(InputMeasurementDto meas1, InputMeasurementDto meas2) throws QuantityMeasurementException;
}
