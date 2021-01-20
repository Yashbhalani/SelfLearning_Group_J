package com.yashbhalani;

public class Main {

    public static void main(String[] args) {
	// write your code here
//    boolean gameOver = true;
//    int score = 800;
//    int levelCompleted = 5;
//    int bonus = 100;
    //int last = calculateScore(true, score,levelCompleted,bonus);
    int last1 = calculateScore(false,30,5,230);
    int last3 = calculateScore(true,30,5,230);
        System.out.println(last1);
        System.out.println(last3);

    }

    public static int calculateScore(boolean gameover,int s, int l,int b){

        if(gameover)
        {
            int score = s + (l*b);
            s += 200;
            return score;
        }

        return -1;
    }
}
