package com.yashbhalani;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int firstNumber = 23_120;// 4 bytes
        int secondNumber = 2_120; // Java 7 onwards, we can use underscores to make numbers readble
        int total = firstNumber+secondNumber;
        int newValue = firstNumber/2;
        System.out.println(total);
        System.out.println("New int" + newValue);

        byte myByteValue = 126; // -128 to 127----1 byte

        //By default, while making an assignment java converts it to integer, So we need to typecaste below
        byte newByteValue = (byte) (myByteValue/2); // casting
        short myShortValue = 31_000; // -32768 to 32767----2 bytes
        long myLongValue = 1234545L;



    }
}
