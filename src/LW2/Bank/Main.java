package LW2.Bank;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты банковских счетов
        Account account1 = new Account(1000); // Начальный баланс: 1000
        Account account2 = new Account(500);  // Начальный баланс: 500

        // Выводим текущие балансы счетов
        System.out.println("Баланс счета 1: " + account1.getBalance());
        System.out.println("Баланс счета 2: " + account2.getBalance());

        // Депозит на счет 1
        account1.deposit(500); // Добавляем 500
        System.out.println("Баланс счета 1 после депозита: " + account1.getBalance());

        // Снятие средств со счета 2
        account2.withdraw(200); // Снимаем 200
        System.out.println("Баланс счета 2 после снятия: " + account2.getBalance());

        // Попытка снять больше средств, чем есть на счете 1
        account1.withdraw(2000); // Попытка снять 2000
        System.out.println("Баланс счета 1 после попытки снятия 2000: " + account1.getBalance());
    }
}
