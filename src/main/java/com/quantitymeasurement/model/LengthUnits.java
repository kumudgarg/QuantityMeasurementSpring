package com.quantitymeasurement.model;

public enum LengthUnits implements IUnit {

    FEET(12.0), INCH(1.0), YARD(36.0), CENTIMETER(0.4);

    public static final LengthUnits baseConversionType = INCH;

    public final double measurementValue;

    LengthUnits(double measurementValue) {
        this.measurementValue = measurementValue;
    }

    @Override
    public Double conversion() {
        return this.measurementValue;
    }

    @Override
    public String getConversionType() {
        return LengthUnits.baseConversionType.toString();
    }
}
