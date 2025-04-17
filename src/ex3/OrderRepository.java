package ex3;

public class OrderRepository {
    public void save(Order order) {
        System.out.println("Заказ сохранен в БД: " + order.getId());
    }
}