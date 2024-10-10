package Air_conditioner;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AirConditionerControlTest {

    @Test
    public void newAirConditioner_thatCanTurnOffTest() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        airConditioner.turnOff();
        assertTrue(airConditioner.turnOff());
    }

    @Test
    public void newAirConditioner_thatCanTurnOnTest() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOff();
        airConditioner.turnOn();
        assertTrue(airConditioner.turnOn());
    }

    @Test
    public void newAirConditioner_canTurnOn_andCanIncreaseTemperatureTest() {
        AirConditioner airConditioner= new AirConditioner();
        airConditioner.turnOn();
        airConditioner.increaseTemperature();
        assertEquals(17, airConditioner.getCurrentTemperature(), "Temperature should be set correctly");
    }

    @Test
    public void newAirConditioner_canTurnOff_andCanDecreaseTemperatureTest() {
        AirConditioner airConditioner= new AirConditioner();
        airConditioner.turnOn();
        airConditioner.decreaseTemperature();
        assertTrue(airConditioner.getCurrentTemperature() == 15, "Temperature should be set correctly");
    }

    @Test
    public void newAirConditioner_thatCanIncreaseTemperature_upTo30degreeTest() {
        AirConditioner airConditioner= new AirConditioner();
        airConditioner.turnOn();
        airConditioner.setTemperature(30);
        assertEquals(30, airConditioner.getCurrentTemperature(), "Temperature should be set correctly");
    }

    @Test
    public void newAirConditioner_thatCanDecreaseTemperature_notBelow16degreeTest() {
        AirConditioner airConditioner= new AirConditioner();
        airConditioner.turnOn();
        airConditioner.setTemperature(16);
        assertEquals(16, airConditioner.getCurrentTemperature(), "Temperature should be set correctly");
    }

}