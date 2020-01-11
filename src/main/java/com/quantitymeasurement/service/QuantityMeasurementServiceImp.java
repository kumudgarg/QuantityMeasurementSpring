package com.quantitymeasurement.service;

import com.quantitymeasurement.model.InputMeasurementDto;
import com.quantitymeasurement.model.TemperatureUnit;
import com.quantitymeasurement.model.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class QuantityMeasurementServiceImp implements  QuantityMeasurementService{

    public QuantityMeasurementServiceImp() {
    }

    @Override
    public Boolean compareUnits(InputMeasurementDto meas1, InputMeasurementDto meas2) throws QuantityMeasurementException {
        if (!meas1.getUnit().getClass().equals(meas2.getUnit().getClass())) {
            throw new QuantityMeasurementException("Class Not Equal", QuantityMeasurementException.ExceptionType.CLASS_NOT_EQUAL);
        }
        double v = meas1.getValue() * meas1.getUnit().conversion();
        double w = meas2.getValue() * meas2.getUnit().conversion();
        return Double.compare(v, w)  == 0;
    }

    @Override
    public double additionOfUnits(InputMeasurementDto meas1, InputMeasurementDto meas2) {
            return ((meas1.getValue() * meas1.getUnit().conversion()) + (meas2.getValue() * meas2.getUnit().conversion()));
        }

    @Override
    public Boolean temperatureConversion(InputMeasurementDto meas1, InputMeasurementDto meas2) {
        if (meas1.getUnit().equals(TemperatureUnit.CELSIUS))
            return Double.compare(Math.round(meas1.getValue() - TemperatureUnit.FAHRENHEIT.measurementValue * (5 / 9)), Math.round(meas1.getValue())) == 0;
        return Double.compare(Math.round((meas2.getValue() * 9 / 5)+ 32) , Math.round(meas1.getValue())) == 0;
    }
}

