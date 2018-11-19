package com.example.jeffreypadgett.interviewPrep;

public class ReverseInteger {


    static int reverseInt (int number) {

        // 12345


        int reverseNumber = 0;

        while (number!=0) {

            reverseNumber = (reverseNumber * 10) + number % 10;
            number = number/10;
        }

        return reverseNumber;



    }
}
