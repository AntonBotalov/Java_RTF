package LW2.Bank;

public interface BankAccount {
    // Метод для депозита денег
    void deposit(double amount);

    // Метод для снятия денег
    void withdraw(double amount);

    // Метод для получения текущего баланса
    double getBalance();
}
