package com.yashbhalani;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte num1 = 5;
        short num2 = 2300;
        int num3 = 230;
        long finalResult = 50000 + 10*(num1+num2+num3);
        short shortTotal = (short)(1000 + 10*(num1+num2+num3));
        System.out.println(shortTotal);
        System.out.println(finalResult);
    }
}
