package com.yashbhalani;

import java.util.SplittableRandom;

public class BankAccount {

    private String account_no;
    private double balance;
    private String cus_name;
    private String email;
    private String phone_no;

    public BankAccount(){
        this("1212",0.00,"DefaultName","pvs74@gmil.com","6565342312"); //this construcot must be in first line in such scenioro
        System.out.println("Empty Constructor called");
    }

    public BankAccount(String account_no,double balance,String cus_name,String email,String phone_no){
        this.account_no = account_no;
        this.balance = balance;
        this.cus_name=cus_name;
        this.email=email;
        this.phone_no = phone_no;
        System.out.println("Account Created with ownername "+this.cus_name);
    }


    public void depositFund(double amount){
        this.balance = this.balance + amount;
        System.out.println("Updated balance is" + balance);

    }

    public void  withdrawFund(double amount){
        if(this.balance>amount){
            this.balance = this.balance -amount;
            System.out.println("Updated balance is" + balance);

        }
        else
            System.out.println("Insufficient Funds");

    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }
}
