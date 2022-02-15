public class BankAccount implements MoneyStorage {

    private double balance;
    private String accountNumber;

    public BankAccount(double startingBalance, String accountNumber) {
        this.balance = -startingBalance;
        this.accountNumber = accountNumber;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getDescription() {
        return String.format("Mortgage #%s", accountNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public boolean deposit(double amount) {
        if (amount <= 0.0) {
            return false;
        }
        balance += amount;
        return true;
    }

    @Override
    public double withdraw(double amount) {
        // can't withdraw a negative amount OR overdraw more than -25
        if (amount <= 0.0 || (balance - amount) < -25.00) {
            return 0.0;
        }
        balance -= amount;
        return amount;
    }
}