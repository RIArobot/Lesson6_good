package ex7;

class SMSNotifier implements INotifier {
    @Override
    public void send(String message) {
        System.out.println("Отправка SMS: " + message);
    }
}
