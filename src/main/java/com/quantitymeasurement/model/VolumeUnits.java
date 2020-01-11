package com.quantitymeasurement.model;

public enum VolumeUnits implements IUnit{
    GALLON(3.78),LITRES(1),MILLILITERS(0.001);
    public static final VolumeUnits baseConversionType = LITRES;

    public final double measurementValue;

    VolumeUnits(double measurementValue) {
        this.measurementValue = measurementValue;
    }

    @Override
    public Double conversion() {
        return this.measurementValue;
    }

    @Override
    public String getConversionType() {
        return VolumeUnits.baseConversionType.toString();
    }
}
