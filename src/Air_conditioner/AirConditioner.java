package Air_conditioner;

public class AirConditioner {

    private boolean turnOn;
    private int temperature = 16;

    public boolean turnOn() {
        return true;
    }

    public boolean turnOff() {
        if(turnOn) return false;
        return true;
    }

    public void increaseTemperature() {
        temperature++;
    }

    public void decreaseTemperature() {
        temperature--;
    }

    public void setTemperature(int absoluteTemperature) {
        if(temperature >= 30) {
            turnOn = true;
            System.out.println("You can not increase the temperature more than 30°C degree");
        }
        temperature = absoluteTemperature;
    }

    public int getCurrentTemperature() {
        if(temperature <= 16) {
            turnOn = true;
            System.out.println("You can not decrease the temperature below than 16°C degree");
        }
        return temperature;
    }
}
