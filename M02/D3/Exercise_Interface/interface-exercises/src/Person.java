public class Person {
    private final String firstName;
    private final String lastName;
    private static MoneyStorage wallet;

    public Person(String firstName, String lastName) {
        // Wallet constructor
        wallet = new Wallet(0.0, String.format("%s's Wallet", firstName));

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }

    public double getBalance(){ return wallet.getBalance(); }

    public String getDescription(){ return wallet.getDescription(); }

    public boolean deposit(double amount){ return wallet.deposit(amount); }

    public double withdraw(double amount){ return wallet.withdraw(amount); }
}