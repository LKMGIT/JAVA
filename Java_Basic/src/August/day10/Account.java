package August.day10;


public class Account {

    final static int MIN_BALANCE = 0;
    final static int MAX_BALANCE = 1000000;

    private int balance;
    private String account_number;
    private String account_name;

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

    public String getAccount_number() {
        return account_number;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public void add_balance(int balance){
        if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
            this.balance += balance;
        }
    }

    public void out_balance(int balance){
        if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
            this.balance -= balance;
        }
    }

    @Override
    public String toString() {
        return account_number + "   " + account_name + "    " + balance;
    }
}
