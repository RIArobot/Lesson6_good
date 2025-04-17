package ex7;

// Низкоуровневые модули (зависят от абстракции)
class EmailNotifier implements INotifier {
    @Override
    public void send(String message) {
        System.out.println("Отправка email: " + message);
    }
}
