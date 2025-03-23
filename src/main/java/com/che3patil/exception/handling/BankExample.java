package com.che3patil.exception.handling;


class InsufficientFundsException extends Exception{

    public InsufficientFundsException(String s) {
        super(s);
    }
}

class BankAccount{
    private double balance = 100;

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance){
            throw new InsufficientFundsException("Insufficient Fund");
        }
        balance = balance -amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);

    }

}

public class BankExample {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        try {
            bankAccount.withdraw(1000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
