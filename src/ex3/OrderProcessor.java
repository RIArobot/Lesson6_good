package ex3;

public class OrderProcessor {
    private final OrderValidator validator;
    private final OrderRepository repository;
    private final EmailService emailService;
    private final OrderLogger logger;

    // Внедрение зависимостей (Dependency Injection)
    public OrderProcessor(OrderValidator validator,
                          OrderRepository repository,
                          EmailService emailService,
                          OrderLogger logger) {
        this.validator = validator;
        this.repository = repository;
        this.emailService = emailService;
        this.logger = logger;
    }

    public void processOrder(Order order) {
        if (!validator.isValid(order)) {
            logger.log("Ошибка: неверный заказ");
            return;
        }

        repository.save(order);
        emailService.sendConfirmation(order.getCustomerEmail());
        logger.log("Заказ обработан: " + order.getId());
    }
}
