package homework.homework20;

public class AccountDemo {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("Balance: " + account.getBalance() + "\n" +
                "Monthly interest: " + account.getMonthlyInterest() + "\n" +
                "Date created: " + account.getDateCreated());
    }
}
