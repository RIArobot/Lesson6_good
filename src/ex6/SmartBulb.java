package ex6;

// Теперь устройства реализуют только нужные интерфейсы
class SmartBulb implements ISwitchable, IBrightnessControllable {
    private boolean isOn;
    private int brightness;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Лампочка включена");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Лампочка выключена");
    }

    @Override
    public void adjustBrightness(int level) {
        brightness = level;
        System.out.println("Яркость установлена на " + level + "%");
    }
}
