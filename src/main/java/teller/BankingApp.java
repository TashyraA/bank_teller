package teller;

import java.util.Collection;
import java.util.Scanner;
import java.util.Set;

public class BankingApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account1 = new Account("1111",
                "Checking", 452.68);
        Account account2 = new Account("2222",
                "Savings", 800.00);
        bank.openNewAccount(account1);
        bank.openNewAccount(account2);
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Here are your accounts at our bank:");

            printAccounts(bank);
            System.out.println("What would you like to do next?\n" +
                    "Press 1 to deposit\n" +
                    "Press 2 to withdrawal\n" +
                    "Press 3 to check balance\n" +
                    "Press 4 to close an account\n" +
                    "Press 0 to exit");
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Here are your accounts\n");
                printAccounts(bank);
                System.out.println("Type the account number to chose an account " +
                        "to deposit to.");
                String accountNumber = scanner.nextLine();
                System.out.println("How much do you want to deposit:");
                double depositAmount = scanner.nextDouble();

            } else if (input == 2) {

            } else if (input == 3) {

            } else if (input == 0) {
                break;
            }
        }
    }
    public static void printAccounts(Bank bank){
        Collection<Account> accounts = bank.getAllAccounts();
        for (Account account:accounts) {
            System.out.println("(" + account.getAccountNumber() + ") " +
                    account.getAccountType() + " " +
                    account.getAccountBalance()
            );
        }
    }
}