package ex1;

public class PaymentProcessor {
    public void processPayment(String paymentId) {
        try {
            System.out.println("Платеж " + paymentId + " обработан.");
        } catch (Exception e) {
            Logger.logError("обработке платежа", e);  // Используем общий логгер
        }
    }
}
