package ex8;

class EmailNotificationService implements INotificationService {
    public void notify(Employee employee) {
        System.out.println("Sending email to " + employee.getEmail());
    }
}
