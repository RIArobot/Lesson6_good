package ex8;

// Соблюдение DIP
class EmployeeProcessor {
    private final IEmployeeRepository repository;
    private final INotificationService notificationService;
    private final ILogger logger;

    // Внедрение зависимостей
    public EmployeeProcessor(IEmployeeRepository repository,
                             INotificationService notificationService,
                             ILogger logger) {
        this.repository = repository;
        this.notificationService = notificationService;
        this.logger = logger;
    }

    // Соблюдение KISS и YAGNI
    public void process(Employee employee) {
        if (!isValid(employee)) {
            logger.log("Invalid employee data");
            return;
        }

        if (repository.existsById(employee.getId())) {
            logger.log("Employee exists");
            return;
        }

        repository.save(employee);
        notificationService.notify(employee);
        logger.log("Added employee: " + employee.getName());
    }

    // Соблюдение DRY
    private boolean isValid(Employee employee) {
        return employee != null
                && isValidString(employee.getName())
                && isValidString(employee.getEmail())
                && employee.getAge() >= 18
                && employee.getAge() <= 65
                && employee.getSalary() > 0;
    }

    private boolean isValidString(String value) {
        return value != null && !value.isEmpty();
    }
}
