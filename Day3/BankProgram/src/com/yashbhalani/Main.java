package com.yashbhalani;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount b1 = new BankAccount("12345",0.00,);

        b1.depositFund(25000);
        b1.withdrawFund(2000);
        b1.withdrawFund(24000);
        double balance = b1.getBalance();
        System.out.println("Balance"+" "+balance);


    }
}
