package ex3;

public class OrderValidator {
    public boolean isValid(Order order) {
        return order != null && !order.getItems().isEmpty();
    }
}
