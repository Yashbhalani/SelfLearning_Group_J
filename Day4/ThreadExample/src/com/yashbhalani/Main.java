package com.yashbhalani;
class Hi extends Thread{
    public void run(){
        for(int i=0;i<5;i++)
            System.out.println("Hi");
    }
}

class Hello extends Thread{
    public void run(){
        for(int i=0;i<5;i++)
            System.out.println("Hello");
    }
}


public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
            Hi obj1 = new Hi();
            Hello obj2 = new Hello();
            obj1.start();
            Thread.sleep(20);
            obj2.start();
    }
}
