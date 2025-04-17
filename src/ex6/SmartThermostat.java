package ex6;

class SmartThermostat implements ISwitchable, ITemperatureControllable {
    private int temperature;

    @Override
    public void turnOn() {
        System.out.println("Термостат включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Термостат выключен");
    }

    @Override
    public void setTemperature(int temp) {
        temperature = temp;
        System.out.println("Температура установлена на " + temp + "°C");
    }
}
