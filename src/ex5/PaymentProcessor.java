package ex5;

public abstract class PaymentProcessor {
    protected double balance;

    public PaymentProcessor(double initialBalance) {
        this.balance = initialBalance;
    }

    protected final void validateAmount(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма должна быть положительной");
        }
    }

    public double getBalance() {
        return balance;
    }

    public abstract void processPayment(double amount);
}
