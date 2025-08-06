package August.day11;

public class Account {
    private String accNo;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
        System.out.println(accNo + " 계좌가 개설되었습니다.");
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void save(int money){
        balance += money;
        System.out.println(accNo + " 계좌에" +money +"만원이 입금되었습니다.");
    }

    public void deposit(int money){
        balance -= money;
        System.out.println(accNo + "계좌에" +money +"만원이 출금되었습니다.");
    }


}
