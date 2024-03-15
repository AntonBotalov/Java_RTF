package LW2.Bank;

public class Account implements BankAccount{
    // Поле для хранения текущего баланса счета
    private double balance;

    // Конструктор класса Account
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Реализация метода для депозита денег
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    // Реализация метода для снятия денег
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств на счете");
        }
    }

    // Реализация метода для получения текущего баланса
    @Override
    public double getBalance() {
        return balance;
    }
}
