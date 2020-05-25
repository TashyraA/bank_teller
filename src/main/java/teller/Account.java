package teller;

public class Account {
    private String accountNumber;
    private String accountType;
    private double accountBalance;

    public Account(String accountNumber, String accountType,
                   double accountBalance){
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(double fundsToDeposit){
        accountBalance += fundsToDeposit;
    }
    public void withdrawal(double fundsToWithdraw){
        accountBalance -= fundsToWithdraw;
    }
}