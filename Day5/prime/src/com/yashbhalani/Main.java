package com.yashbhalani;

import java.util.Scanner;

public class Main {

    public static void checkprime(int num){
        boolean flag = false;
        for(int i=2;i<=num/2;i++){
            if((num%i)==0){
                flag = true;
                break;}
            else
                flag=false;
        }
        if(flag)
            System.out.println("non prime");
        else
            System.out.println("prime");


    }

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        checkprime(i);
    }
}
