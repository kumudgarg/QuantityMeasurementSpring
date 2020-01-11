package com.quantitymeasurement.model;

public enum WeightUnits implements IUnit{
    KILOGRAMS(1.0), GRAMS(1d/1000), TONNES(1000);

    public static final WeightUnits baseConversionType = KILOGRAMS;

    public final double measurementValue;

    WeightUnits(double measurementValue) {
        this.measurementValue = measurementValue;
    }

    @Override
    public Double conversion() {
        return this.measurementValue;
    }

    @Override
    public String getConversionType() {
        return WeightUnits.baseConversionType.toString();
    }
}
