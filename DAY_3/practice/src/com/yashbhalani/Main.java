package com.yashbhalani;

class Animal{
    void eat() {System.out.println("eating...");}
    void play(String x) {
        System.out.println(x);
    }
}
class Dog extends Animal{
    void eat() {System.out.println("barking...");}
    void play(int a){
        a = 15;
        System.out.println(a);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal d = new Dog();
        d.eat();  //based on type of object call is binded
//        d.play(12);

    }
}
