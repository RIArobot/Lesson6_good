package ex6;

class SmartSpeaker implements ISwitchable, IMusicPlayer {
    @Override
    public void turnOn() {
        System.out.println("Колонка включена");
    }

    @Override
    public void turnOff() {
        System.out.println("Колонка выключена");
    }

    @Override
    public void playMusic(String song) {
        System.out.println("Играет: " + song);
    }
}
