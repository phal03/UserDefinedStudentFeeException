package com.hackercode.UserDefinedExceptions;

public class FeePayException extends Exception {

    private double fee;
    public FeePayException(double fee){
        this.fee=fee;
    }
    public double getFee() {
        return fee;
    }
}
