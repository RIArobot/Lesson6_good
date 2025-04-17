package ex7;

import java.util.List;

// Высокоуровневый модуль (зависит от абстракции)
class AlertService {
    private List<INotifier> notifiers;

    // Внедрение зависимостей через конструктор
    public AlertService(List<INotifier> notifiers) {
        this.notifiers = notifiers;
    }

    public void sendAlert(String message) {
        for (INotifier notifier : notifiers) {
            notifier.send(message);
        }
    }
}
