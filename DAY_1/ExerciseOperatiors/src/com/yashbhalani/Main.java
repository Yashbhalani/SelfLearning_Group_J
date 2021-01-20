package com.yashbhalani;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double x = 20;
        double y= 80;
        double total = (x + y) * 25;
        System.out.println(total);
        double remainderIs = total % 40;
        if(remainderIs<=20)
            System.out.println("Total was over the limit");
        

    }
}
