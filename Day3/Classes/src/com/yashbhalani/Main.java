package com.yashbhalani;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car audi = new Car();
        Car inova = new Car();
        System.out.println("Model is" + audi.getModel());
        //audi=null;
        audi.setModel("100x");
        inova.setModel("101x");
        System.out.println("Model is" + audi.getModel());
    }
}
