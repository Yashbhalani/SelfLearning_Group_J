package com.yashbhalani;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num1 = 5;
        float myFloat = 5f; // prefixing "f" like 5.3f is mandatory or it will be taken as double
        double myDouble = 23.4;
        double myDouble2 = 23.4d; // 8 bytes
        float num2 = (float)3.4; // 4 bytes
        System.out.println(myFloat);
        System.out.println("myDouble" + myDouble);
    }
}
