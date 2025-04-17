package ex3;

import java.util.List;

public class Main_Solid {
    public static void main(String[] args) {
        Order order = new Order("user@example.com", "123", List.of("Item1", "Item2"));

        // Создаем сервисы
        OrderValidator validator = new OrderValidator();
        OrderRepository repository = new OrderRepository();
        EmailService emailService = new EmailService();
        OrderLogger logger = new OrderLogger();

        // Передаем их в OrderProcessor
        OrderProcessor processor = new OrderProcessor(validator, repository, emailService, logger);
        processor.processOrder(order);
    }
}
