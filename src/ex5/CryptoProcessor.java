package ex5;

public class CryptoProcessor extends PaymentProcessor
        implements IAccountVerifiable, IPaymentValidatable {

    private static final double MIN_CRYPTO_PAYMENT = 0.01;

    public CryptoProcessor(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void verifyAccount() {
        System.out.println("Проверка криптокошелька...");
    }

    @Override
    public void validatePayment(double amount, double balance) {
        if (amount < MIN_CRYPTO_PAYMENT) {
            throw new IllegalArgumentException("Минимальная сумма " + MIN_CRYPTO_PAYMENT);
        }
    }

    @Override
    public void processPayment(double amount) {
        validateAmount(amount);
        validatePayment(amount, balance);
        balance -= amount;
        System.out.println("Криптоплатеж на " + amount + " обработан. Остаток: " + balance);
    }
}
