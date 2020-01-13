package com.quantitymeasurement.controller;

import com.quantitymeasurement.model.InputMeasurementDto;
import com.quantitymeasurement.model.OutputMeasurementDto;
import com.quantitymeasurement.model.Unit;
import com.quantitymeasurement.service.EnumProvider;
import com.quantitymeasurement.service.QuantityMeasurementException;
import com.quantitymeasurement.service.QuantityMeasurementService;
import com.quantitymeasurement.service.QuantityMeasurementServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/measurement")
public class QuantityMeasurement {

    @Autowired
    private QuantityMeasurementService quantityMeasurementService;

    @Autowired
    private EnumProvider enumProvider;

    @GetMapping("/compare")
    public String compareUnits(@RequestParam (value = "unit1")String unit1,@RequestParam(value = "value1")Double value1,
                                @RequestParam (value = "unit2")String unit2,@RequestParam(value = "value2")Double value2) throws QuantityMeasurementException {

        InputMeasurementDto inputMeasurementDto1 = new InputMeasurementDto(enumProvider.getType(unit1), value1);
        InputMeasurementDto inputMeasurementDto2 = new InputMeasurementDto(enumProvider.getType(unit2), value2);
        String compareResult = new OutputMeasurementDto(quantityMeasurementService.compareUnits(inputMeasurementDto1, inputMeasurementDto2), inputMeasurementDto1, inputMeasurementDto2).getCompareResult();
        return compareResult;
    }

    @PostMapping("/addition")
    public String additionOfUnits(@RequestParam (value = "unit1")String unit1,@RequestParam(value = "value1")Double value1,
                                  @RequestParam (value = "unit2")String unit2,@RequestParam(value = "value2")Double value2) {
        try {
            InputMeasurementDto inputMeasurementDto1 = new InputMeasurementDto(enumProvider.getType(unit1), value1);
            InputMeasurementDto inputMeasurementDto2 = new InputMeasurementDto(enumProvider.getType(unit2), value2);
            String compareResult = null;
            compareResult = new OutputMeasurementDto(quantityMeasurementService.additionOfUnits(inputMeasurementDto1, inputMeasurementDto2), inputMeasurementDto1, inputMeasurementDto2).getAddtionResult();
            return compareResult;
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }

       return null;
    }

    @PostMapping("/temp")
    public String temperatureConversion(@RequestParam (value = "unit1")String unit1,@RequestParam(value = "value1")Double value1,
                                         @RequestParam (value = "unit2")String unit2,@RequestParam(value = "value2")Double value2) {
        try {
            InputMeasurementDto inputMeasurementDto1 = new InputMeasurementDto(enumProvider.getType(unit1), value1);
            InputMeasurementDto inputMeasurementDto2 = new InputMeasurementDto(enumProvider.getType(unit2), value2);
            String compareResult = null;
            compareResult = new OutputMeasurementDto(quantityMeasurementService.temperatureConversion(inputMeasurementDto1, inputMeasurementDto2), inputMeasurementDto1, inputMeasurementDto2).getCompareResult();
            return compareResult;
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
        return null;
    }

}
