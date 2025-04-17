package ex1;

public class OrderProcessor {
    public void processOrder(String orderId) {
        try {
            System.out.println("Заказ " + orderId + " обработан.");
        } catch (Exception e) {
            Logger.logError("обработке заказа", e);  // Используем общий логгер
        }
    }
}
