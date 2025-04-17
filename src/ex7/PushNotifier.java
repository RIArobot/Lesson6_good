package ex7;

class PushNotifier implements INotifier {  // Новый тип нотификатора
    @Override
    public void send(String message) {
        System.out.println("Отправка push-уведомления: " + message);
    }
}
