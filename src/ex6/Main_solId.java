package ex6;

public class Main_solId {
    public static void main(String[] args) {
        ISwitchable bulb = new SmartBulb();
        IBrightnessControllable dimmableBulb = new SmartBulb();
        ITemperatureControllable thermo = new SmartThermostat();

        bulb.turnOn();
        dimmableBulb.adjustBrightness(50);

        // Теперь невозможно вызвать:
        // bulb.setTemperature(20); // Ошибка компиляции (и это правильно!)

        // Гибкое использование
        SmartSpeaker speaker = new SmartSpeaker();
        speaker.playMusic("Imagine - John Lennon");

        // Комбинирование интерфейсов
        ISwitchable[] devices = {new SmartBulb(), new SmartThermostat(), new SmartSpeaker()};
        for (ISwitchable device : devices) {
            device.turnOn();
        }
    }
}
