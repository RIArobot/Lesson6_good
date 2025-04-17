package ex5;

public class CreditCardProcessor extends PaymentProcessor implements IAccountVerifiable {
    public CreditCardProcessor(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void verifyAccount() {
        System.out.println("Проверка данных кредитной карты...");
    }

    @Override
    public void processPayment(double amount) {
        validateAmount(amount);
        if (amount > balance) {
            throw new IllegalStateException("Недостаточно средств");
        }
        balance -= amount;
        System.out.println("Кредитный платеж на " + amount + " обработан. Остаток: " + balance);
    }
}
