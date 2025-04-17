package ex1;

public class DRYMain {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder("ORD123");

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment("PAY456");
    }
}

