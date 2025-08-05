package August.day10;


public class Account {

    final static int MIN_BALANCE = 0;
    final static int MAX_BALANCE = 1000000;

    int balance;
    String account_number;
    String account_name;

    public Account() {
    }

    public Account(int balance, String account_number, String account_name) {
        this.balance = balance;
        this.account_number = account_number;
        this.account_name = account_name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
            this.balance = balance;
        }
    }
}
