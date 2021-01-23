package com.yashbhalani;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        Runnable obj1 = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    System.out.println("hii");
                    try{Thread.sleep(1000);}catch (Exception e){}
            }}
        };

        Runnable obj2 = () -> {
                for(int i=0;i<5;i++) {
                    System.out.println("hii2");
                    try{Thread.sleep(1000);}catch (Exception e){}
                }
        };


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(
                () -> {
                    for(int i=0;i<5;i++)
                        System.out.println("hii3"+ Thread.currentThread().getPriority());
                }, "yash"
        );
        System.out.println(t1.getName());
        t2.setName("Raja");
        System.out.println(t3.getName());
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(4);
        t1.start();
        t2.start();
        t3.start();
        t1.join(); // it waits for t1 to die
        t2.join();
        t3.join();
        System.out.println(t1.isAlive());
        System.out.println("bye");
    }
}
