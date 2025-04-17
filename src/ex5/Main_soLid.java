package ex5;

public class Main_soLid {
    public static void makePayment(PaymentProcessor processor, double amount) {
        if (processor instanceof IAccountVerifiable) {
            ((IAccountVerifiable)processor).verifyAccount();
        }
        if (processor instanceof IPaymentValidatable) {
            ((IPaymentValidatable)processor).validatePayment(amount, processor.getBalance());
        }
        processor.processPayment(amount);
    }

    public static void main(String[] args) {
        PaymentProcessor creditCard = new CreditCardProcessor(1000);
        PaymentProcessor crypto = new CryptoProcessor(1000);

        makePayment(creditCard, 100); // Работает
        //makePayment(crypto, 0.001);  // Четко сообщит о минимальной сумме
        //makePayment(crypto, 2000);   // Проверит баланс через validatePayment

        // Можно безопасно работать через базовый класс
        PaymentProcessor processor = getProcessor("CRYPTO");
        processor.processPayment(100); // Гарантированно безопасно
    }

    public static PaymentProcessor getProcessor(String type) {
        return switch(type) {
            case "CREDIT" -> new CreditCardProcessor(1000);
            case "CRYPTO" -> new CryptoProcessor(1000);
            default -> throw new IllegalArgumentException("Unknown processor type");
        };
    }
}
