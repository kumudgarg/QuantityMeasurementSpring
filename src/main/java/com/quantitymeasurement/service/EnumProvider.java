package com.quantitymeasurement.service;

import com.quantitymeasurement.model.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class EnumProvider {
    private final HashMap<String, IUnit> unitHashMap;

    public EnumProvider() {
        this.unitHashMap = new HashMap<>();
        unitHashMap.put("FEET", LengthUnits.FEET);
        unitHashMap.put("INCH", LengthUnits.INCH);
        unitHashMap.put("YARD", LengthUnits.YARD);
        unitHashMap.put("CENTIMETER", LengthUnits.CENTIMETER);
        unitHashMap.put("GALLON", VolumeUnits.GALLON);
        unitHashMap.put("LITRES", VolumeUnits.LITRES);
        unitHashMap.put("MILLILITERS", VolumeUnits.MILLILITERS);
        unitHashMap.put("KILOGRAMS", WeightUnits.KILOGRAMS);
        unitHashMap.put("GRAMS", WeightUnits.GRAMS);
        unitHashMap.put("TONNES", WeightUnits.TONNES);
        unitHashMap.put("FAHRENHEIT", TemperatureUnit.FAHRENHEIT);
        unitHashMap.put("CELSIUS", TemperatureUnit.CELSIUS);
    }

    public IUnit getType(String unit1) {
        return unitHashMap.get(unit1);
    }
}
