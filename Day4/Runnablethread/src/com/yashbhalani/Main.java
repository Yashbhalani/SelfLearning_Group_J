package com.yashbhalani;

class Hi implements Runnable{
    public void run(){
        for(int i=0;i<5;i++)
            System.out.println("Hi");
    }
}

class Hello implements Runnable{
    public void run(){
        for(int i=0;i<5;i++)
            System.out.println("Hello");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Runnable obj1 = new Hi();
        Runnable obj2 = new Hello();
        Thread t1 =new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}






