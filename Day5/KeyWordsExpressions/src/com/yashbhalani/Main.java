package com.yashbhalani;

public class Main {

    public static void main(String[] args) {

            //calculateScore(20000,3,450); //arguments
            int x = calculateScore(1000,4,343);
        System.out.println(x);

    }

    public static int calculateScore(int score,int level,int bonus) {
            int x =5;
            if (x == 5) {
                int finalScore = score + (level * bonus);
                System.out.println(finalScore); //block can access outside variables

            }
            System.out.println("data");
            return -1;

    }





//        int newData = finalScore; //finalscore which is in block is local to that block, so wee can't access it.
//


}
