package com.yashbhalani;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String month = "January"; // use of string method

        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            case "march":
                System.out.println("March");
                break;
            default:
                System.out.println("Another than first 3");
                break;

        }
    }
}
