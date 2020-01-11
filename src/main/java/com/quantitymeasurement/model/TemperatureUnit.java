package com.quantitymeasurement.model;

public enum TemperatureUnit implements IUnit{
    FAHRENHEIT(32.0), CELSIUS(1.0);

    public static final TemperatureUnit baseConversionType = CELSIUS;

    public final double measurementValue;

    TemperatureUnit(Double measurementValue) {
        this.measurementValue = measurementValue;
    }

    @Override
    public Double conversion() {
        if (this.equals(FAHRENHEIT))
            return FAHRENHEIT.measurementValue;
        return CELSIUS.measurementValue;
    }

    @Override
    public String getConversionType() {
        return TemperatureUnit.baseConversionType.toString();
    }
}
