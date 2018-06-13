package com.hackercode.utilities;

import com.hackercode.UserDefinedExceptions.FeePayException;

public class CheckBalance {

    private int roll;
    private double balance;
    public CheckBalance(int roll){
        this.roll=roll;
    }
    public void payBal(double amount) {
        balance=amount;
    }
    public void feePaymentCheck(double amount)throws FeePayException{
        balance-=amount;
        if(balance>=1000){
            throw new FeePayException(balance);
        }
    }
    public double getBalance() {
        return balance;
    }

    public int getRoll() {
        return roll;
    }
}
