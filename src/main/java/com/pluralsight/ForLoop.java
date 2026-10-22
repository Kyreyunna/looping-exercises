package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
////        Use a for loop to display a countdown from 10 to 1 and then end by displaying the
////        word "Launch!"

        for (int countdown = 10; countdown >=1; countdown--) {
            System.out.println(countdown);
            Thread.sleep(1000);

        }
        System.out.println("Launch!");


        }
    }

