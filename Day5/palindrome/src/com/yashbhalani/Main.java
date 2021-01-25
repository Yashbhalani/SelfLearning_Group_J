package com.yashbhalani;


import java.util.Scanner;

class Tester{

    public static boolean checkpalin(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        if (str.equals(rev)) {
            return true;
        }
        else {
            return false;
        }
    }

}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        System.out.println(Tester.checkpalin(x));

    }
}
