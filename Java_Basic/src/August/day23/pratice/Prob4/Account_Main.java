package August.day23.pratice.Prob4;

import java.io.*;

public class Account_Main {
    public static void main(String[] args) throws Exception {
        Account account = new Account("철수", 10000);
        String path = "C:/Temp/account.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(account);

        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        try {
            while (true) {
                Account account1 = (Account) ois.readObject();
                System.out.println("계좌명 : " + account1.getOwner());
                System.out.println("금액 : " + account1.getBalance());
                
            }
        } catch (EOFException e) {
            System.out.println("종료");
        } finally {
            ois.close();
        }


    }
}
