import com.quantitymeasurement.model.*;
import com.quantitymeasurement.service.QuantityMeasurementException;
import com.quantitymeasurement.service.QuantityMeasurementService;
import com.quantitymeasurement.service.QuantityMeasurementServiceImp;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementServiceTest {

    @Test
    void given1FEETAnd1FEET_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.FEET,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.FEET,1.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1FEETAnd12INCH_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.FEET,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.INCH,12.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1FEETAndPoint333YARD_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.FEET,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.YARD,0.333);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1FEETAnd30CM_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.FEET,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.CENTIMETER,30.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1FEETAnd1KG_IfClassesDiffernt_ShouldReturnFalse() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.FEET,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(WeightUnits.KILOGRAMS,12.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.CLASS_NOT_EQUAL,e.type);

        }

    }

    @Test
    void given1YARDAnd1YARD_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.YARD,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.YARD,1.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1YARDAnd36INCH_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.YARD,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.INCH,36.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }


    @Test
    void given1YARDAnd90CM_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.YARD,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.CENTIMETER,90.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1YARDAnd3FEET_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.YARD,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.FEET,3.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1CMAnd1CM_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.CENTIMETER,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.CENTIMETER,1.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }


    @Test
    void given1CMAndPoint4INCH_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.CENTIMETER,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.INCH,0.4);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }



    @Test
    void given1CMAndPoint0333FEET_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.CENTIMETER,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.FEET,0.0333);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }



    @Test
    void given1CMAndPoint011YARD_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.CENTIMETER,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.YARD,0.011);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1INCHAnd1INCH_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.INCH,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.INCH,1.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1INCHAndPoint083FEET_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.INCH,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.FEET,0.083);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1INCHAndPoint027YARD_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.INCH,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.YARD,0.027);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }


    @Test
    void given1INCHAnd2Point5CM_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.INCH,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.CENTIMETER,2.5);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1KGAnd1KG_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(WeightUnits.KILOGRAMS,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(WeightUnits.KILOGRAMS,1.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1KGAnd1000GRAMS_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(WeightUnits.KILOGRAMS,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(WeightUnits.GRAMS,1000.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1KGAndPoint001TONNES_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(WeightUnits.KILOGRAMS,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(WeightUnits.TONNES,0.001);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }


    @Test
    void given1GRAMAndPoint001GRAM_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(WeightUnits.GRAMS,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(WeightUnits.GRAMS,1.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }
    @Test
    void given1GRAMAndPoint001KG_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(WeightUnits.GRAMS,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(WeightUnits.KILOGRAMS,0.001);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1GRAMAndPoint000001TONNES_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(WeightUnits.GRAMS,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(WeightUnits.TONNES,0.000001);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1TONNAnd1TONNES_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(WeightUnits.TONNES,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(WeightUnits.TONNES,1.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1TONNAnd1000000GRAMS_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(WeightUnits.TONNES,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(WeightUnits.GRAMS,1000000.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1TONNAnd1000KG_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(WeightUnits.TONNES,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(WeightUnits.KILOGRAMS,1000.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1GALLONAnd1GALLON_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(VolumeUnits.GALLON,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(VolumeUnits.GALLON,1.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1GALLONAnd3PointLITERS_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(VolumeUnits.GALLON,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(VolumeUnits.LITRES,3.78);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1GALLONAnd378ML_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(VolumeUnits.GALLON,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(VolumeUnits.MILLILITERS,3780.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1LITERAnd1LITER_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(VolumeUnits.LITRES,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(VolumeUnits.LITRES,1.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1LITERAnd0Point264GALLON_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(VolumeUnits.LITRES,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(VolumeUnits.GALLON,0.264);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1LITERAnd1000ML_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(VolumeUnits.LITRES,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(VolumeUnits.MILLILITERS,1000.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1MLAnd1ML_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(VolumeUnits.MILLILITERS,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(VolumeUnits.MILLILITERS,1.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1MLAndPoint001LITERS_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(VolumeUnits.MILLILITERS,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(VolumeUnits.LITRES,0.001);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1MLAndPoint0002GALLON_WhenEquals_ShouldReturnTrue() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(VolumeUnits.MILLILITERS,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(VolumeUnits.GALLON,0.0002);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            Boolean isUnitMatch = measurementService.compareUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(true,isUnitMatch);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1FEETAnd1FEET_WhenAdded_ShouldReturn24INCH() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.FEET,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.FEET,1.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            double additionOfUnits = measurementService.additionOfUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(24.0,additionOfUnits,0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1FEETAnd12INCH_WhenAdded_ShouldReturn24INCH() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.FEET,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.INCH,12.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            double additionOfUnits = measurementService.additionOfUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(24.0,additionOfUnits,0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1FEETAnd1YARD_WhenAdded_ShouldReturn48INCH() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.FEET,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.YARD,1.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            double additionOfUnits = measurementService.additionOfUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(48.0,additionOfUnits,0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1FEETAnd1CM_WhenAdded_ShouldReturn12Point4INCH() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.FEET,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.CENTIMETER,1.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            double additionOfUnits = measurementService.additionOfUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(12.4,additionOfUnits,0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1YARDAnd1YARD_WhenAdded_ShouldReturn72INCH() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.YARD,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.YARD,1.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            double additionOfUnits = measurementService.additionOfUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(72.0,additionOfUnits,0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1YARDAnd12INCH_WhenAdded_ShouldReturn48INCH() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.YARD,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.INCH,12.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            double additionOfUnits = measurementService.additionOfUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(48.0,additionOfUnits,0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1YARDAnd90CM_WhenAdded_ShouldReturn72INCH() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.YARD,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.CENTIMETER,90.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            double additionOfUnits = measurementService.additionOfUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(72.0,additionOfUnits,0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1YARDAnd3FEET_WhenAdded_ShouldReturn72INCH() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.YARD,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.FEET,3.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            double additionOfUnits = measurementService.additionOfUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(72.0,additionOfUnits,0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1CMAnd1CM_WhenAdded_ShouldReturnPOINT8INCH() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.CENTIMETER,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.CENTIMETER,1.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            double additionOfUnits = measurementService.additionOfUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(0.8,additionOfUnits,0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1CMAndPoint4INCH_WhenAdded_ShouldReturnPoint8INCH() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.CENTIMETER,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.INCH,0.4);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            double additionOfUnits = measurementService.additionOfUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(0.8,additionOfUnits,0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1CMAnd1FEET_WhenAdded_ShouldReturn12Point4INCH() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.CENTIMETER,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.FEET,1.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            double additionOfUnits = measurementService.additionOfUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(12.4,additionOfUnits,0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }



    @Test
    void given1CMAnd1YARD_WhenAdded_ShouldReturn36Point4INCH() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.CENTIMETER,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.YARD,1.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            double additionOfUnits = measurementService.additionOfUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(36.4,additionOfUnits,0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given1INCHAnd1INCH_WhenAdded_ShouldReturn2INCH() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.INCH,1.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.INCH,1.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            double additionOfUnits = measurementService.additionOfUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(2.0,additionOfUnits,0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }

    @Test
    void given12INCHAndPoint1FEET_WhenEquals_ShouldReturn24INCH() {
        try {
            InputMeasurementDto measurementDto1 = new InputMeasurementDto(LengthUnits.INCH,12.0);
            InputMeasurementDto measurementDto2 = new InputMeasurementDto(LengthUnits.FEET,1.0);
            QuantityMeasurementService measurementService = new QuantityMeasurementServiceImp();
            double additionOfUnits = measurementService.additionOfUnits(measurementDto1, measurementDto2);
            Assert.assertEquals(24.0,additionOfUnits,0.0);
        } catch (QuantityMeasurementException e) {
            e.printStackTrace();
        }
    }



}
