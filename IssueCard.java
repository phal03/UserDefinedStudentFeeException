package com.hackercode.controller;

import com.hackercode.UserDefinedExceptions.FeePayException;
import com.hackercode.utilities.CheckBalance;

import java.util.Scanner;

public class IssueCard {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id no.:");
        CheckBalance c = new CheckBalance(sc.nextInt());
        System.out.println("Enter balance of student:");
        c.payBal(sc.nextDouble());
        try{
            System.out.println("Depositing Fee");
            c.feePaymentCheck(94250.00);
            System.out.println("Admit card issued!");

        } catch(FeePayException e){
            System.out.println("Admit card not issued!\nBalance left : Rs."+e.getFee());
        }
        sc.close();
    }
}
