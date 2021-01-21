package com.yashbhalani;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int val=3;

        switch (val){
            case 1:
                System.out.println("Value 1");
                break;

            case  2:
                System.out.println("value 2");
                break;

            case 3: case 4: case 5:
                System.out.println("it is 3,4 or 5");
                break;

            default:
                System.out.println("Not available");
        }
        System.out.println("Finishing");
    }
}
