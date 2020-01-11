package com.quantitymeasurement.model;

public class InputMeasurementDto {

    private IUnit unit;
    private Double value;

    public InputMeasurementDto(IUnit unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    public IUnit getUnit() {
        return unit;
    }

    public Double getValue() {
        return value;
    }
}
