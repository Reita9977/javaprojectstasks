package com.company;
class Account {
    String owner, AccountNumber;
    int Balance;

    public Account(String owner, String AccountNumber, int Balance) {
        this.owner = owner;
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public void Transfer(int amount) throws InsufficientFundsException {
        if (Balance > amount) {
            Balance -= amount;
        } else {
            throw new InsufficientFundsException ("Insufficient Funds");
        }
    }

}

public class Task3 {
    public static void main(String[]args) throws InsufficientFundsException {
        Account User1 = new Account("Bruce","0000 5555 6666 7777 8888",9000);
        Account User2 = new Account("Clark","1234 1234 1234 1234 1234",7000);
        try{
            User2.Transfer(5000);
        }
        catch(InsufficientFundsException tf){
            System.out.println(tf);
        }
        finally{
            System.out.println("Amount left on your Bank is "+User2.Balance);
        }

    }
}
