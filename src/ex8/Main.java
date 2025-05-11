package ex8;

public class Main {
    public static void main(String[] args) {
        // Конфигурация зависимостей
        IEmployeeRepository repository = new JdbcEmployeeRepository();
        INotificationService notificationService = new EmailNotificationService();
        ILogger logger = new ConsoleLogger();

        EmployeeProcessor processor = new EmployeeProcessor(
                repository, notificationService, logger);

        Employee emp = new RegularEmployee(1, "John Doe", 30, 50000, "john@example.com");
        processor.process(emp);
    }
}
