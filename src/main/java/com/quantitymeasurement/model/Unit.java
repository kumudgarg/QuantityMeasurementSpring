package com.quantitymeasurement.model;

public class Unit {

     private IUnit unit;
     private Double value;


     private LengthUnits lengthUnits;

     private VolumeUnits volumeUnits;

     private WeightUnits weightUnits;

     private TemperatureUnit temperatureUnit;

     public Unit(IUnit unit, Double value) {
          this.unit = unit;
          this.value = value;
     }

     public LengthUnits getLengthUnits() {
          return lengthUnits;
     }

     public Unit() {
     }

     public VolumeUnits getVolumeUnits() {
          return volumeUnits;
     }

     public WeightUnits getWeightUnits() {
          return weightUnits;
     }

     public TemperatureUnit getTemperatureUnit() {
          return temperatureUnit;
     }

     public void setLengthUnits(LengthUnits lengthUnits) {
          this.lengthUnits = lengthUnits;
     }

     public void setVolumeUnits(VolumeUnits volumeUnits) {
          this.volumeUnits = volumeUnits;
     }

     public void setWeightUnits(WeightUnits weightUnits) {
          this.weightUnits = weightUnits;
     }

     public void setTemperatureUnit(TemperatureUnit temperatureUnit) {
          this.temperatureUnit = temperatureUnit;
     }

     public IUnit getUnit() {
          return unit;
     }

     public Double getValue() {
          return value;
     }
}
