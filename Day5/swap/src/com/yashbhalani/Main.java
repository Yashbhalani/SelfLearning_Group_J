package com.yashbhalani;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String a = "Yash";
        String b = "Soni";
        System.out.println(a + " " + b);
        a = a + b; //YashSoni  //SoniYash
        b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length());
        System.out.println(a + b + " ");
    }
}
