package com.quantitymeasurement.model;

import com.quantitymeasurement.model.InputMeasurementDto;

public class OutputMeasurementDto {

    private Object result;
    private InputMeasurementDto measurement1;
    private  InputMeasurementDto measurement2;

    public OutputMeasurementDto(Object result, InputMeasurementDto measurement1, InputMeasurementDto measurement2) {
        this.result = result;
        this.measurement1 = measurement1;
        this.measurement2 = measurement2;
    }

    public String getCompareResult(){
        return this.getInputAsString() + "\nresult : " + (Boolean)result;
    }

    public  String getAddtionResult() {
        return this.getInputAsString() + "\nresult: " + (Double)result + measurement1.getUnit().getConversionType();
    }

    private String getInputAsString() {
        return "\nmeasurement1" + " " +  measurement1.getUnit() + " " + measurement1.getValue()
        +  "\nmeasurement2" + " " +  measurement2.getUnit() + " " + measurement2.getValue();
    }
}
