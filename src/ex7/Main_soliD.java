package ex7;

import java.util.List;

public class Main_soliD {
    public static void main(String[] args) {
        // Конфигурация зависимостей (можно вынести в DI-контейнер)
        List<INotifier> notifiers = List.of(
                new EmailNotifier(),
                new SMSNotifier(),
                new PushNotifier()  // Добавляем без изменения AlertService
        );

        AlertService alerts = new AlertService(notifiers);
        alerts.sendAlert("Сервер упал!");
    }
}
